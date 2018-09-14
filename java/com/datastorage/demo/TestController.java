package com.datastorage.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.datastorage.demo.util.JacksonUtil;

@RequestMapping("/test")
@Controller
public class TestController {
	
	/**
	 * 测试页面请求
	 * 
	 * @return
	 */
	@RequestMapping("/ceshi")
	public @ResponseBody String hello(){
		//获取api请求参数 封装在Params类里
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", "1");
		map.put("name", "2");
		map.put("age", "3");
		Params params = new Params();
		params.setDbname("datastorage");
		params.setType("all");//all:全量; where:条件; page:分页; sort: 排序; 
		params.setKey("3");
		params.setPage("1");
		params.setPagenums("10");
		params.setSort("asc");
		params.setSortname("id");
		params.setConditions(map);
		String jsonstr = JacksonUtil.toJSon(params);
		
		// 请求
		HttpClient client = new HttpClient();
		try {
			client.connect("127.0.0.1", 7878, jsonstr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "调用完毕";
	}
}
