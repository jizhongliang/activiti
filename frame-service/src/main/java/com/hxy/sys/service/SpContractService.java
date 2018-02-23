package com.hxy.sys.service;

import com.hxy.sys.entity.SpContractEntity;

import java.util.List;
import java.util.Map;

/**
 * 合同表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-05 14:13:25
 */
public interface SpContractService {
	
	SpContractEntity queryObject(Long id);
	
	List<SpContractEntity> queryList(Map <String, Object> map);

    List<SpContractEntity> queryListByBean(SpContractEntity entity);
	
	int queryTotal(Map <String, Object> map);
	
	int save(SpContractEntity spContract);
	
	int update(SpContractEntity spContract);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
