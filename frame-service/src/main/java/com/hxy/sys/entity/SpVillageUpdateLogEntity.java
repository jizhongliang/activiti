package com.hxy.sys.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 小区表修改日志
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-02 16:06:40
 */
public class SpVillageUpdateLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键
	private Long id;
	//小区表ID
	private Long villageId;
	//旧值
	private String oldValue;
	//新值
	private String newValue;
	//修改人ID
	private Long updateUserId;
	//创建时间
	private Date createTime;

	/**
	 * 设置：主键
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：小区表ID
	 */
	public void setVillageId(Long villageId) {
		this.villageId = villageId;
	}
	/**
	 * 获取：小区表ID
	 */
	public Long getVillageId() {
		return villageId;
	}
	/**
	 * 设置：旧值
	 */
	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}
	/**
	 * 获取：旧值
	 */
	public String getOldValue() {
		return oldValue;
	}
	/**
	 * 设置：新值
	 */
	public void setNewValue(String newValue) {
		this.newValue = newValue;
	}
	/**
	 * 获取：新值
	 */
	public String getNewValue() {
		return newValue;
	}
	/**
	 * 设置：修改人ID
	 */
	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
	}
	/**
	 * 获取：修改人ID
	 */
	public Long getUpdateUserId() {
		return updateUserId;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
}
