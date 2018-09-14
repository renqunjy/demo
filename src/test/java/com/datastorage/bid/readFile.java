package com.datastorage.bid;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 练习读、写文件内容
 * 
 * @author RQ
 *
 */
public class readFile {

	static FileWriter fw;
	static BufferedWriter bw;

	static FileReader fr;
	static BufferedReader br;

	static File file = new File("E://file.txt");

	public static void main(String[] args) throws IOException {
		// 判断文件是否存在
		if (!file.exists()) {
			//不存在则创建文件
			file.createNewFile();

			// 把用户输入的数据写入文件
			Scanner input = new Scanner(System.in);
			System.out.println("请输入学号： ");
			String no = input.next();
			System.out.println("请输入姓名： ");
			String name = input.next();
			System.out.println("请输入身份证号： ");
			String cardno = input.next();

			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			bw.write("编号" + "\t" + "姓名" + "\t" + "身份证号");
			bw.write("\n");
			bw.write(no + "\t" + name + "\t" + cardno);

			System.out.println("信息已保存！");
			
			//关闭流
			fw.close();
			bw.close();
		} else {
			// 文件已存在则读取
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String readstr = null;
			while ((readstr = br.readLine()) != null) {
				System.out.println(readstr);
			}
			
			//关闭流
			fr.close();
			br.close();
		}
	}
}
