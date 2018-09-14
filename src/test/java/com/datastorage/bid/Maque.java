package com.datastorage.bid;

/**
 * 麻雀
 * @author RQ
 *
 */
public class Maque extends Bird {
	
	public Maque(String name, String color){
		super(name, color);
	}
	
	@Override
	public void fly(){
		System.out.println(super.getColor() + " 的 " + super.getName() + " 在天空飞");
	}
	
	@Override
	public void eat(){
		System.out.println(super.getColor() + " 的 " + super.getName() + " 在吃虫");
	}
}
