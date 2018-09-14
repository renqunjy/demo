package com.datastorage.demo;

import java.io.Serializable;
import java.util.Map;

public class Params implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Params(){}
	
	//数据库名称
	public String dbname;
	//redis key; 如果key有值,则不根据下方查询条件去查询数据库
	public String key;
	//请求类型 all:全量; where:条件; page:分页; sort: 排序; vague: 模糊
	public String type;
	//第几页
	private String page;
	//每页条数
	private String pagenums;
	//排序方式 asc、desc, 默认asc
	private String sort;
	//排序字段
	private String sortname;
	//查询条件集合
	public Map<String,Object> conditions;
	
	
	public String getSortname() {
		return sortname;
	}
	public void setSortname(String sortname) {
		this.sortname = sortname;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPagenums() {
		return pagenums;
	}
	public void setPagenums(String pagenums) {
		this.pagenums = pagenums;
	}
	public String getDbname() {
		return dbname;
	}
	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Map<String, Object> getConditions() {
		return conditions;
	}
	public void setConditions(Map<String, Object> conditions) {
		this.conditions = conditions;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
