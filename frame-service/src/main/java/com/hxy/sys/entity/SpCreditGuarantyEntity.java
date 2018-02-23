package com.hxy.sys.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 审批额度担抵押（车位）信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-06 17:52:00
 */
public class SpCreditGuarantyEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //主键
    private Long              id;
    //用户标识
    private Long              userId;
    //额度信息id
    private Long              creditId;
    //项目id
    private Long              villageId;
    //车位地址
    private String            parkAddress;
    //车位面积
    private String            parkArea;
    //车位原购价格
    private BigDecimal        parkOldPrice;
    //评估价
    private BigDecimal        price;
    //公允价
    private BigDecimal        gprice;
    //车位转让价格
    private BigDecimal        parkPrice;
    //是否有证：1:有证 0:无证
    private String            isCard;
    //车位使用情况
    private String            parkUsage;
    //车位号
    private String            parkNo;
    //房产证号码
    private String            houseNo;
    //土地号码
    private String            landNo;
    //不动产号码
    private String            estateNo;
    //车位转让协议号
    private String            parkTransferNo;
    //他项权证号
    private String            hisPowerNo;
    //新增人
    private String            addName;
    //新增部门
    private String            addDepart;
    //修改人
    private String            updateName;
    //担保物状态:0:失效,1:正常
    private String            state;
    //添加时间
    private Date              addTime;
    //修改时间
    private Date              updateTime;

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
     * 设置：额度信息id
     */
    public void setCreditId(Long creditId) {
        this.creditId = creditId;
    }

    /**
     * 获取：额度信息id
     */
    public Long getCreditId() {
        return creditId;
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
     * 设置：车位地址
     */
    public void setParkAddress(String parkAddress) {
        this.parkAddress = parkAddress;
    }

    /**
     * 获取：车位地址
     */
    public String getParkAddress() {
        return parkAddress;
    }

    /**
     * 设置：车位面积
     */
    public void setParkArea(String parkArea) {
        this.parkArea = parkArea;
    }

    /**
     * 获取：车位面积
     */
    public String getParkArea() {
        return parkArea;
    }

    /**
     * 设置：车位原购价格
     */
    public void setParkOldPrice(BigDecimal parkOldPrice) {
        this.parkOldPrice = parkOldPrice;
    }

    /**
     * 获取：车位原购价格
     */
    public BigDecimal getParkOldPrice() {
        return parkOldPrice;
    }

    /**
     * 设置：评估价
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取：评估价
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置：公允价
     */
    public void setGprice(BigDecimal gprice) {
        this.gprice = gprice;
    }

    /**
     * 获取：公允价
     */
    public BigDecimal getGprice() {
        return gprice;
    }

    /**
     * 设置：车位转让价格
     */
    public void setParkPrice(BigDecimal parkPrice) {
        this.parkPrice = parkPrice;
    }

    /**
     * 获取：车位转让价格
     */
    public BigDecimal getParkPrice() {
        return parkPrice;
    }

    /**
     * 设置：是否有证：1:有证 0:无证
     */
    public void setIsCard(String isCard) {
        this.isCard = isCard;
    }

    /**
     * 获取：是否有证：1:有证 0:无证
     */
    public String getIsCard() {
        return isCard;
    }

    /**
     * 设置：车位使用情况
     */
    public void setParkUsage(String parkUsage) {
        this.parkUsage = parkUsage;
    }

    /**
     * 获取：车位使用情况
     */
    public String getParkUsage() {
        return parkUsage;
    }

    /**
     * 设置：车位号
     */
    public void setParkNo(String parkNo) {
        this.parkNo = parkNo;
    }

    /**
     * 获取：车位号
     */
    public String getParkNo() {
        return parkNo;
    }

    /**
     * 设置：房产证号码
     */
    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    /**
     * 获取：房产证号码
     */
    public String getHouseNo() {
        return houseNo;
    }

    /**
     * 设置：土地号码
     */
    public void setLandNo(String landNo) {
        this.landNo = landNo;
    }

    /**
     * 获取：土地号码
     */
    public String getLandNo() {
        return landNo;
    }

    /**
     * 设置：不动产号码
     */
    public void setEstateNo(String estateNo) {
        this.estateNo = estateNo;
    }

    /**
     * 获取：不动产号码
     */
    public String getEstateNo() {
        return estateNo;
    }

    /**
     * 设置：车位转让协议号
     */
    public void setParkTransferNo(String parkTransferNo) {
        this.parkTransferNo = parkTransferNo;
    }

    /**
     * 获取：车位转让协议号
     */
    public String getParkTransferNo() {
        return parkTransferNo;
    }

    /**
     * 设置：他项权证号
     */
    public void setHisPowerNo(String hisPowerNo) {
        this.hisPowerNo = hisPowerNo;
    }

    /**
     * 获取：他项权证号
     */
    public String getHisPowerNo() {
        return hisPowerNo;
    }

    /**
     * 设置：新增人
     */
    public void setAddName(String addName) {
        this.addName = addName;
    }

    /**
     * 获取：新增人
     */
    public String getAddName() {
        return addName;
    }

    /**
     * 设置：新增部门
     */
    public void setAddDepart(String addDepart) {
        this.addDepart = addDepart;
    }

    /**
     * 获取：新增部门
     */
    public String getAddDepart() {
        return addDepart;
    }

    /**
     * 设置：修改人
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    /**
     * 获取：修改人
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * 设置：担保物状态:0:失效,1:正常
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 获取：担保物状态:0:失效,1:正常
     */
    public String getState() {
        return state;
    }

    /**
     * 设置：添加时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取：添加时间
     */
    public Date getAddTime() {
        return addTime;
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
}
