package com.hxy.sys.service;

import com.hxy.sys.entity.SpBondEntity;

import java.util.List;
import java.util.Map;

/**
 * 担保人管理
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-06 14:03:37
 */
public interface SpBondService {
	
	SpBondEntity queryObject(Long id);
	
	List<SpBondEntity> queryList(Map <String, Object> map);

    List<SpBondEntity> queryListByBean(SpBondEntity entity);
	
	int queryTotal(Map <String, Object> map);
	
	int save(SpBondEntity spBond);
	
	int update(SpBondEntity spBond);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
