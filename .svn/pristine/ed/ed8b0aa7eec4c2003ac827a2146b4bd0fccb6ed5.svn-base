package com.hxy.sys.service;

import com.hxy.sys.entity.SpVillageUpdateLogEntity;

import java.util.List;
import java.util.Map;

/**
 * 小区表修改日志
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-02 16:06:40
 */
public interface SpVillageUpdateLogService {
	
	SpVillageUpdateLogEntity queryObject(Long id);
	
	List<SpVillageUpdateLogEntity> queryList(Map<String, Object> map);

    List<SpVillageUpdateLogEntity> queryListByBean(SpVillageUpdateLogEntity entity);
	
	int queryTotal(Map<String, Object> map);
	
	int save(SpVillageUpdateLogEntity spVillageUpdateLog);
	
	int update(SpVillageUpdateLogEntity spVillageUpdateLog);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
