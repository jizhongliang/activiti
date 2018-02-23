package com.hxy.sys.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 省市区
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-07 09:34:41
 */
public class SpAreaEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String areaCode;
	//
	private String areaName;
	//
	private String fatherCode;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	/**
	 * 获取：
	 */
	public String getAreaCode() {
		return areaCode;
	}
	/**
	 * 设置：
	 */
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	/**
	 * 获取：
	 */
	public String getAreaName() {
		return areaName;
	}
	/**
	 * 设置：
	 */
	public void setFatherCode(String fatherCode) {
		this.fatherCode = fatherCode;
	}
	/**
	 * 获取：
	 */
	public String getFatherCode() {
		return fatherCode;
	}
}
