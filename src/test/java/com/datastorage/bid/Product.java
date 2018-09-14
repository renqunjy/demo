package com.datastorage.bid;

public class Product{
	public String no;
	public String name;
	public String price;
	public String num;
	public String unit;
	Product(String no, String name, String price, String num, String unit){
		this.no = no;
		this.name = name;
		this.price = price;
		this.num = num;
		this.unit = unit;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
}
