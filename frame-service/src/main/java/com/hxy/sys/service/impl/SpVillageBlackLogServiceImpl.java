package com.hxy.sys.service.impl;

import com.hxy.base.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.hxy.sys.dao.SpVillageBlackLogDao;
import com.hxy.sys.entity.SpVillageBlackLogEntity;
import com.hxy.sys.service.SpVillageBlackLogService;



@Service("spVillageBlackLogService")
public class SpVillageBlackLogServiceImpl implements SpVillageBlackLogService {
	@Autowired
	private SpVillageBlackLogDao spVillageBlackLogDao;
	
	@Override
	public SpVillageBlackLogEntity queryObject(Long id){
		return spVillageBlackLogDao.queryObject(id);
	}
	
	@Override
	public List<SpVillageBlackLogEntity> queryList(Map<String, Object> map){
		return spVillageBlackLogDao.queryList(map);
	}

    @Override
    public List<SpVillageBlackLogEntity> queryListByBean(SpVillageBlackLogEntity entity) {
        return spVillageBlackLogDao.queryListByBean(entity);
    }
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return spVillageBlackLogDao.queryTotal(map);
	}
	
	@Override
	public int save(SpVillageBlackLogEntity spVillageBlackLog){
	    spVillageBlackLog.setId(Long.valueOf(Utils.uuid()));
		return spVillageBlackLogDao.save(spVillageBlackLog);
	}
	
	@Override
	public int update(SpVillageBlackLogEntity spVillageBlackLog){
        return spVillageBlackLogDao.update(spVillageBlackLog);
	}
	
	@Override
	public int delete(Long id){
        return spVillageBlackLogDao.delete(id);
	}
	
	@Override
	public int deleteBatch(Long[] ids){
        return spVillageBlackLogDao.deleteBatch(ids);
	}
	
}
