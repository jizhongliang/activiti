package com.hxy.sys.service;

import com.hxy.sys.entity.ApiLogEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2017-12-23 11:16:00
 */
public interface ApiLogService {
	
	ApiLogEntity queryObject(String id);
	
	List<ApiLogEntity> queryList(Map<String, Object> map);

    List<ApiLogEntity> queryListByBean(ApiLogEntity entity);
	
	int queryTotal(Map<String, Object> map);
	
	int save(ApiLogEntity apiLog);
	
	int update(ApiLogEntity apiLog);
	
	int delete(String id);
	
	int deleteBatch(String[] ids);
}
