package com.hxy.sys.service;

import com.hxy.sys.entity.SpVillageEntity;

import java.util.List;
import java.util.Map;

/**
 * 小区表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-02 16:06:40
 */
public interface SpVillageService {
	
	SpVillageEntity queryObject(Long id);
	
	List<SpVillageEntity> queryList(Map<String, Object> map);

    List<SpVillageEntity> queryListByBean(SpVillageEntity entity);
	
	int queryTotal(Map<String, Object> map);
	
	int save(SpVillageEntity spVillage);
	
	int update(SpVillageEntity spVillage);
	SpVillageEntity queryName(String name);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
