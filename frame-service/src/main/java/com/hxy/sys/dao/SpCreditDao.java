package com.hxy.sys.dao;

import com.hxy.sys.entity.SpCreditEntity;
import com.hxy.base.dao.BaseDao;

import java.util.Date;

import org.springframework.stereotype.Repository;

/**
 * 审批额度信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-06 17:08:04
 */
@Repository
public interface SpCreditDao extends BaseDao<SpCreditEntity> {
	SpCreditEntity queryXlz(Date time);
}
