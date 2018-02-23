package com.hxy.sys.service;

import com.hxy.sys.entity.SpGuarantyEntity;

import java.util.List;
import java.util.Map;

/**
 * 担保物管理
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-06 10:50:17
 */
public interface SpGuarantyService {
	
	SpGuarantyEntity queryObject(Long id);
	
	List<SpGuarantyEntity> queryList(Map <String, Object> map);

    List<SpGuarantyEntity> queryListByBean(SpGuarantyEntity entity);
	
	int queryTotal(Map <String, Object> map);
	
	int save(SpGuarantyEntity spGuaranty);
	
	int update(SpGuarantyEntity spGuaranty);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
