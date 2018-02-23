package com.hxy.sys.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 审批额度信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-06 17:08:04
 */
public class SpCreditEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //用户标识
    private Long              userId;
    //合同订单号
    private String            contractNum;
    //项目id
    private Long              villageId;
    //录入人id
    private Long              addId;
    //申请额度
    private BigDecimal        credit;
    //日利率
    private BigDecimal        rate;
    //申请日期
    private Date              declareTime;
    //申请公司
    private String            declareCompany;
    //申请人
    private String            declarePeople;
    //业务类型:Z:直租,H:回租,X:其他
    private String            serviceType;
    //业务品种:C:纯存量,M:存量含买断,X:增转存
    private String            serviceVariety;
    //修改时间
    private Date              updateTime;
    //业务流程状态
    private Integer           status;
    //流程发起时间
    private Date              startTime;
    //流程实例id
    private String            instanceId;
    //流程定义id
    private String            defid;
    //流程发起人
    private String            startUserId;
    //审批结果
    private Integer           actResult;
    //添加时间
    private Date              addTime;
    //序列值
    private Integer           xlz;
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

    public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Integer getXlz() {
		return xlz;
	}

	public void setXlz(Integer xlz) {
		this.xlz = xlz;
	}

	/**
     * 设置：用户标识
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取：用户标识
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置：合同订单号
     */
    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    /**
     * 获取：合同订单号
     */
    public String getContractNum() {
        return contractNum;
    }

    /**
     * 设置：项目id
     */
    public void setVillageId(Long villageId) {
        this.villageId = villageId;
    }

    /**
     * 获取：项目id
     */
    public Long getVillageId() {
        return villageId;
    }

    /**
     * 设置：录入人id
     */
    public void setAddId(Long addId) {
        this.addId = addId;
    }

    /**
     * 获取：录入人id
     */
    public Long getAddId() {
        return addId;
    }

    /**
     * 设置：申请额度
     */
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    /**
     * 获取：申请额度
     */
    public BigDecimal getCredit() {
        return credit;
    }

    /**
     * 设置：日利率
     */
    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    /**
     * 获取：日利率
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * 设置：申请日期
     */
    public void setDeclareTime(Date declareTime) {
        this.declareTime = declareTime;
    }

    /**
     * 获取：申请日期
     */
    public Date getDeclareTime() {
        return declareTime;
    }

    /**
     * 设置：申请公司
     */
    public void setDeclareCompany(String declareCompany) {
        this.declareCompany = declareCompany;
    }

    /**
     * 获取：申请公司
     */
    public String getDeclareCompany() {
        return declareCompany;
    }

    /**
     * 设置：申请人
     */
    public void setDeclarePeople(String declarePeople) {
        this.declarePeople = declarePeople;
    }

    /**
     * 获取：申请人
     */
    public String getDeclarePeople() {
        return declarePeople;
    }

    /**
     * 设置：业务类型:Z:直租,H:回租,X:其他
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * 获取：业务类型:Z:直租,H:回租,X:其他
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * 设置：业务品种:C:纯存量,M:存量含买断,X:增转存
     */
    public void setServiceVariety(String serviceVariety) {
        this.serviceVariety = serviceVariety;
    }

    /**
     * 获取：业务品种:C:纯存量,M:存量含买断,X:增转存
     */
    public String getServiceVariety() {
        return serviceVariety;
    }

    /**
     * 设置：修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取：修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置：业务流程状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取：业务流程状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置：流程发起时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取：流程发起时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置：流程实例id
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * 获取：流程实例id
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * 设置：流程定义id
     */
    public void setDefid(String defid) {
        this.defid = defid;
    }

    /**
     * 获取：流程定义id
     */
    public String getDefid() {
        return defid;
    }

    /**
     * 设置：流程发起人
     */
    public void setStartUserId(String startUserId) {
        this.startUserId = startUserId;
    }

    /**
     * 获取：流程发起人
     */
    public String getStartUserId() {
        return startUserId;
    }

    /**
     * 设置：审批结果
     */
    public void setActResult(Integer actResult) {
        this.actResult = actResult;
    }

    /**
     * 获取：审批结果
     */
    public Integer getActResult() {
        return actResult;
    }
}
