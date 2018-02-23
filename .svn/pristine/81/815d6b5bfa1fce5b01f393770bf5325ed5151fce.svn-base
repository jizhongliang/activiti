package com.hxy.sys.service;

import com.hxy.sys.entity.SpCreditRereqEntity;

import java.util.List;
import java.util.Map;

/**
 * 审批材料表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-06 17:52:00
 */
public interface SpCreditRereqService {
	
	SpCreditRereqEntity queryObject(Long id);
	
	List<SpCreditRereqEntity> queryList(Map<String, Object> map);

    List<SpCreditRereqEntity> queryListByBean(SpCreditRereqEntity entity);
	
	int queryTotal(Map<String, Object> map);
	
	int save(SpCreditRereqEntity spCreditRereq);
	
	int update(SpCreditRereqEntity spCreditRereq);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
