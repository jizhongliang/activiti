package com.hxy.sys.service;

import com.hxy.sys.entity.SpCreditGuarantyEntity;

import java.util.List;
import java.util.Map;

/**
 * 审批额度担抵押（车位）信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-06 17:52:00
 */
public interface SpCreditGuarantyService {
	
	SpCreditGuarantyEntity queryObject(Long id);
	
	List<SpCreditGuarantyEntity> queryList(Map<String, Object> map);

    List<SpCreditGuarantyEntity> queryListByBean(SpCreditGuarantyEntity entity);
	
	int queryTotal(Map<String, Object> map);
	
	int save(SpCreditGuarantyEntity spCreditGuaranty);
	
	int update(SpCreditGuarantyEntity spCreditGuaranty);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
