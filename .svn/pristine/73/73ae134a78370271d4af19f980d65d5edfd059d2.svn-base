package com.hxy.sys.service;

import com.hxy.sys.entity.SpVillageBlackLogEntity;

import java.util.List;
import java.util.Map;

/**
 * 小区拉黑日志表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-02 16:06:40
 */
public interface SpVillageBlackLogService {
	
	SpVillageBlackLogEntity queryObject(Long id);
	
	List<SpVillageBlackLogEntity> queryList(Map<String, Object> map);

    List<SpVillageBlackLogEntity> queryListByBean(SpVillageBlackLogEntity entity);
	
	int queryTotal(Map<String, Object> map);
	
	int save(SpVillageBlackLogEntity spVillageBlackLog);
	
	int update(SpVillageBlackLogEntity spVillageBlackLog);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
