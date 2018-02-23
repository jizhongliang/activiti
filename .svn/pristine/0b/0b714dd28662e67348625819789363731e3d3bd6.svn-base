package com.hxy.sys.service;

import com.hxy.sys.entity.SpAreaEntity;

import java.util.List;
import java.util.Map;

/**
 * 省市区
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-07 09:34:41
 */
public interface SpAreaService {
	
	SpAreaEntity queryObject(Integer id);
	
	List<SpAreaEntity> queryList(Map<String, Object> map);

    List<SpAreaEntity> queryListByBean(SpAreaEntity entity);
	
	int queryTotal(Map<String, Object> map);
	
	int save(SpAreaEntity spArea);
	
	int update(SpAreaEntity spArea);
	
	int delete(Integer id);
	
	int deleteBatch(Integer[] ids);
}
