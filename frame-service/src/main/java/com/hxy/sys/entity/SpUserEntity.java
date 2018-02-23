package com.hxy.sys.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 用户信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-07 16:18:54
 */
public class SpUserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//小区id
	private Long villageId;
	//姓名
	private String name;
	//身份证号
	private String idNo;
	//证件有效期
	private Date idNoDeadline;
	//出生日期
	private Date birthTime;
	//性别
	private String sex;
	//婚姻状况
	private String maritalStatus;
	//年龄
	private Long age;
	//民族
	private String ethnic;
	//籍贯
	private String nativePlace;
	//手机号
	private String phone;
	//最高学历
	private String education;
	//居住状况（自由住房，租房，其他）
	private String livingSituation;
	//户口所在地
	private String registeredResidence;
	//通讯地址
	private String postalAddress;
	//个人照片
	private String photo;
	//身份证照片
	private String idNoPhoto;
	//评价信息
	private String appraiseInfo;
	//调查报告
	private String examineReport;
	//拉黑原因
	private String defriendMsg;
	//解除黑名单原因
	private String removeMsg;
	//是否是黑名单 2是 1不是
	private String defriendState;
	//创建时间
	private Date createTiem;
	//业务流程状态
	private Integer status;
	//流程发起时间
	private Date startTime;
	//流程实例id
	private String instanceId;
	//流程定义id
	private String defid;
	//流程发起人
	private String startUserId;
	//审批结果
	private Integer actResult;

	/**
	 * 设置：id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：小区id
	 */
	public void setVillageId(Long villageId) {
		this.villageId = villageId;
	}
	/**
	 * 获取：小区id
	 */
	public Long getVillageId() {
		return villageId;
	}
	/**
	 * 设置：姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：身份证号
	 */
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	/**
	 * 获取：身份证号
	 */
	public String getIdNo() {
		return idNo;
	}
	/**
	 * 设置：证件有效期
	 */
	public void setIdNoDeadline(Date idNoDeadline) {
		this.idNoDeadline = idNoDeadline;
	}
	/**
	 * 获取：证件有效期
	 */
	public Date getIdNoDeadline() {
		return idNoDeadline;
	}
	/**
	 * 设置：出生日期
	 */
	public void setBirthTime(Date birthTime) {
		this.birthTime = birthTime;
	}
	/**
	 * 获取：出生日期
	 */
	public Date getBirthTime() {
		return birthTime;
	}
	/**
	 * 设置：性别
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 获取：性别
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 设置：婚姻状况
	 */
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	/**
	 * 获取：婚姻状况
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}
	/**
	 * 设置：年龄
	 */
	public void setAge(Long age) {
		this.age = age;
	}
	/**
	 * 获取：年龄
	 */
	public Long getAge() {
		return age;
	}
	/**
	 * 设置：民族
	 */
	public void setEthnic(String ethnic) {
		this.ethnic = ethnic;
	}
	/**
	 * 获取：民族
	 */
	public String getEthnic() {
		return ethnic;
	}
	/**
	 * 设置：籍贯
	 */
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	/**
	 * 获取：籍贯
	 */
	public String getNativePlace() {
		return nativePlace;
	}
	/**
	 * 设置：手机号
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：手机号
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：最高学历
	 */
	public void setEducation(String education) {
		this.education = education;
	}
	/**
	 * 获取：最高学历
	 */
	public String getEducation() {
		return education;
	}
	/**
	 * 设置：居住状况（自由住房，租房，其他）
	 */
	public void setLivingSituation(String livingSituation) {
		this.livingSituation = livingSituation;
	}
	/**
	 * 获取：居住状况（自由住房，租房，其他）
	 */
	public String getLivingSituation() {
		return livingSituation;
	}
	/**
	 * 设置：户口所在地
	 */
	public void setRegisteredResidence(String registeredResidence) {
		this.registeredResidence = registeredResidence;
	}
	/**
	 * 获取：户口所在地
	 */
	public String getRegisteredResidence() {
		return registeredResidence;
	}
	/**
	 * 设置：通讯地址
	 */
	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}
	/**
	 * 获取：通讯地址
	 */
	public String getPostalAddress() {
		return postalAddress;
	}
	/**
	 * 设置：个人照片
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	/**
	 * 获取：个人照片
	 */
	public String getPhoto() {
		return photo;
	}
	/**
	 * 设置：身份证照片
	 */
	public void setIdNoPhoto(String idNoPhoto) {
		this.idNoPhoto = idNoPhoto;
	}
	/**
	 * 获取：身份证照片
	 */
	public String getIdNoPhoto() {
		return idNoPhoto;
	}
	/**
	 * 设置：评价信息
	 */
	public void setAppraiseInfo(String appraiseInfo) {
		this.appraiseInfo = appraiseInfo;
	}
	/**
	 * 获取：评价信息
	 */
	public String getAppraiseInfo() {
		return appraiseInfo;
	}
	/**
	 * 设置：调查报告
	 */
	public void setExamineReport(String examineReport) {
		this.examineReport = examineReport;
	}
	/**
	 * 获取：调查报告
	 */
	public String getExamineReport() {
		return examineReport;
	}
	/**
	 * 设置：拉黑原因
	 */
	public void setDefriendMsg(String defriendMsg) {
		this.defriendMsg = defriendMsg;
	}
	/**
	 * 获取：拉黑原因
	 */
	public String getDefriendMsg() {
		return defriendMsg;
	}
	/**
	 * 设置：解除黑名单原因
	 */
	public void setRemoveMsg(String removeMsg) {
		this.removeMsg = removeMsg;
	}
	/**
	 * 获取：解除黑名单原因
	 */
	public String getRemoveMsg() {
		return removeMsg;
	}
	/**
	 * 设置：是否是黑名单 2是 1不是
	 */
	public void setDefriendState(String defriendState) {
		this.defriendState = defriendState;
	}
	/**
	 * 获取：是否是黑名单 2是 1不是
	 */
	public String getDefriendState() {
		return defriendState;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTiem(Date createTiem) {
		this.createTiem = createTiem;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTiem() {
		return createTiem;
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
