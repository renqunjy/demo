package com.datastorage.demo;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import com.datastorage.demo.util.JacksonUtil;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpRequestEncoder;
import io.netty.handler.codec.http.HttpResponseDecoder;
import io.netty.handler.codec.http.HttpVersion;

@SuppressWarnings("deprecation")
public class HttpClient {
	
	public void connect(String host, int port, String paramJson) throws Exception {
		EventLoopGroup workerGroup = new NioEventLoopGroup();

		try {
			Bootstrap b = new Bootstrap(); // (1)
			b.group(workerGroup); // (2)
			b.channel(NioSocketChannel.class); // (3)
			b.option(ChannelOption.SO_KEEPALIVE, true); // (4)
			b.handler(new ChannelInitializer<SocketChannel>() {
				@Override
				public void initChannel(SocketChannel ch) throws Exception {
					// 客户端接收到的是httpResponse响应，所以要使用HttpResponseDecoder进行解码
					ch.pipeline().addLast(new HttpResponseDecoder());
					// 客户端发送的是httprequest，所以要使用HttpRequestEncoder进行编码
					ch.pipeline().addLast(new HttpRequestEncoder());
					ch.pipeline().addLast(new HttpClientInboundHandler());
				}
			});

			// 启动客户端
			ChannelFuture f = b.connect(host, port).sync(); // (5)

			URI uri = new URI("http://" + host + ":" + port);
			DefaultFullHttpRequest request = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.POST, uri.toASCIIString(), Unpooled.wrappedBuffer(paramJson.getBytes()));

			// 构建http请求
			request.headers().set(HttpHeaders.Names.HOST, host);
			request.headers().set(HttpHeaders.Names.CONNECTION, HttpHeaders.Values.KEEP_ALIVE);
			request.headers().set(HttpHeaders.Names.CONTENT_LENGTH, request.content().readableBytes());
			request.headers().set("messageType", "normal");
			request.headers().set("businessType", "testNetty");
			// 发送http请求
			f.channel().write(request);
			f.channel().flush();
			f.channel().closeFuture().sync();
		} finally {
			workerGroup.shutdownGracefully();
		}

	}

}
