package com.datastorage.bid;

/**
 * 企鹅
 * @author RQ
 *
 */
public class Qie extends Bird {

	public Qie(String name, String color){
		super(name, color);
	}
	
	@Override
	public void fly(){
		System.out.println(super.getColor() + " 的 " + super.getName() + " 不会飞");
	}
	
	@Override
	public void eat(){
		System.out.println(super.getColor() + " 的 " + super.getName() + " 在吃鱼");
	}
	
	/**
	 * 企鹅 - 游泳
	 */
	public void youyong(){
		System.out.println(super.getColor() + " 的 " + super.getName() + " 在游泳");
	}
	
}
