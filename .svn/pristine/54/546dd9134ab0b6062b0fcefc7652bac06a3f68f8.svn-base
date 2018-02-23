package com.hxy.sys.service.impl;

import com.hxy.base.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.hxy.sys.dao.SpVillageUpdateLogDao;
import com.hxy.sys.entity.SpVillageUpdateLogEntity;
import com.hxy.sys.service.SpVillageUpdateLogService;



@Service("spVillageUpdateLogService")
public class SpVillageUpdateLogServiceImpl implements SpVillageUpdateLogService {
	@Autowired
	private SpVillageUpdateLogDao spVillageUpdateLogDao;
	
	@Override
	public SpVillageUpdateLogEntity queryObject(Long id){
		return spVillageUpdateLogDao.queryObject(id);
	}
	
	@Override
	public List<SpVillageUpdateLogEntity> queryList(Map<String, Object> map){
		return spVillageUpdateLogDao.queryList(map);
	}

    @Override
    public List<SpVillageUpdateLogEntity> queryListByBean(SpVillageUpdateLogEntity entity) {
        return spVillageUpdateLogDao.queryListByBean(entity);
    }
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return spVillageUpdateLogDao.queryTotal(map);
	}
	
	@Override
	public int save(SpVillageUpdateLogEntity spVillageUpdateLog){
	    spVillageUpdateLog.setId(Long.valueOf(Utils.uuid()));
		return spVillageUpdateLogDao.save(spVillageUpdateLog);
	}
	
	@Override
	public int update(SpVillageUpdateLogEntity spVillageUpdateLog){
        return spVillageUpdateLogDao.update(spVillageUpdateLog);
	}
	
	@Override
	public int delete(Long id){
        return spVillageUpdateLogDao.delete(id);
	}
	
	@Override
	public int deleteBatch(Long[] ids){
        return spVillageUpdateLogDao.deleteBatch(ids);
	}
	
}
