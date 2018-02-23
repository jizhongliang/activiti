/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.hxy.dto;

/**
 * 
 * @author jinlilong
 * @version $Id: CreditListEntity.java, v 0.1 2018年2月6日 下午1:48:22 jinlilong Exp $
 */
public class CreditListDto {

    /**  合同订单号*/
    private String contractNum;

    /**  真实姓名*/
    private String realName;

    /**  */
    private String phone;

    /**  项目名称*/
    private String villageName;

    /**  发起人*/
    private String addUserName;

    /**  处理状态*/
    private String status;

    /** 接收时间*/
    private String addDate;

    /**
     * Getter method for property <tt>contractNum</tt>.
     * 
     * @return property value of contractNum
     */
    public String getContractNum() {
        return contractNum;
    }

    /**
     * Setter method for property <tt>contractNum</tt>.
     * 
     * @param contractNum value to be assigned to property contractNum
     */
    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    /**
     * Getter method for property <tt>realName</tt>.
     * 
     * @return property value of realName
     */
    public String getRealName() {
        return realName;
    }

    /**
     * Setter method for property <tt>realName</tt>.
     * 
     * @param realName value to be assigned to property realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * Getter method for property <tt>phone</tt>.
     * 
     * @return property value of phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter method for property <tt>phone</tt>.
     * 
     * @param phone value to be assigned to property phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter method for property <tt>villageName</tt>.
     * 
     * @return property value of villageName
     */
    public String getVillageName() {
        return villageName;
    }

    /**
     * Setter method for property <tt>villageName</tt>.
     * 
     * @param villageName value to be assigned to property villageName
     */
    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }

    /**
     * Getter method for property <tt>addUserName</tt>.
     * 
     * @return property value of addUserName
     */
    public String getAddUserName() {
        return addUserName;
    }

    /**
     * Setter method for property <tt>addUserName</tt>.
     * 
     * @param addUserName value to be assigned to property addUserName
     */
    public void setAddUserName(String addUserName) {
        this.addUserName = addUserName;
    }

    /**
     * Getter method for property <tt>status</tt>.
     * 
     * @return property value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for property <tt>status</tt>.
     * 
     * @param status value to be assigned to property status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter method for property <tt>addDate</tt>.
     * 
     * @return property value of addDate
     */
    public String getAddDate() {
        return addDate;
    }

    /**
     * Setter method for property <tt>addDate</tt>.
     * 
     * @param addDate value to be assigned to property addDate
     */
    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

}
