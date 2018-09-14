package com.datastorage.bid;

/**
 * 父类 - 鸟儿
 * @author RQ
 *
 */
public class Bird {
	private String name;
	private String color;
	
	public Bird(){}
	public Bird(String name){
		this.name = name;
	}
	public Bird(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	/**
	 * 公共方法 - 飞
	 */
	public void fly(){
		System.out.println(color + " 的 " + name + " 在天上自由的飞翔");
	}
	
	/**
	 * 公共方法 - 吃
	 */
	public void eat(){
		System.out.println(color + " 的 " + name + " 在大口大口的吃虫子");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
