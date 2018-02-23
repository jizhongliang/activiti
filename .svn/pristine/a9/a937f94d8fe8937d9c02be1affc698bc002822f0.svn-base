package com.hxy.sys.service;

import com.hxy.sys.entity.SpCreditEntity;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 审批额度信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-06 17:08:04
 */
public interface SpCreditService {
	
	SpCreditEntity queryObject(Long id);
	
	List<SpCreditEntity> queryList(Map<String, Object> map);

    List<SpCreditEntity> queryListByBean(SpCreditEntity entity);
	
	int queryTotal(Map<String, Object> map);
	
	int save(SpCreditEntity spCredit);
	
	int update(SpCreditEntity spCredit);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
	SpCreditEntity queryXlz(Date time);
}
