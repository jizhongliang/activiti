package com.hxy.sys.service;

import com.hxy.sys.entity.SpCreditBondEntity;

import java.util.List;
import java.util.Map;

/**
 * 审批担保人信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-06 17:52:00
 */
public interface SpCreditBondService {
	
	SpCreditBondEntity queryObject(Long id);
	
	List<SpCreditBondEntity> queryList(Map<String, Object> map);

    List<SpCreditBondEntity> queryListByBean(SpCreditBondEntity entity);
	
	int queryTotal(Map<String, Object> map);
	
	int save(SpCreditBondEntity spCreditBond);
	
	int update(SpCreditBondEntity spCreditBond);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
