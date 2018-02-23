package com.hxy.sys.service;

import com.hxy.sys.entity.PyLevyApiLogEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2017-12-22 17:30:29
 */
public interface PyLevyApiLogService {
	
	PyLevyApiLogEntity queryObject(String id);
	
	List<PyLevyApiLogEntity> queryList(Map<String, Object> map);

    List<PyLevyApiLogEntity> queryListByBean(PyLevyApiLogEntity entity);
	
	int queryTotal(Map<String, Object> map);
	
	int save(PyLevyApiLogEntity pyLevyApiLog);
	
	int update(PyLevyApiLogEntity pyLevyApiLog);
	
	int delete(String id);
	
	int deleteBatch(String[] ids);
}
