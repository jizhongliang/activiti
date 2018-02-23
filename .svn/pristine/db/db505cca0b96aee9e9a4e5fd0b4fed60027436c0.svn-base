package com.hxy.sys.service.impl;

import com.hxy.base.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hxy.sys.dao.SpVillageDao;
import com.hxy.sys.entity.SpVillageEntity;
import com.hxy.sys.service.SpVillageService;



@Service("spVillageService")
public class SpVillageServiceImpl implements SpVillageService {
	@Autowired
	private SpVillageDao spVillageDao;
	
	@Override
	public SpVillageEntity queryObject(Long id){
		return spVillageDao.queryObject(id);
	}
	
	@Override
	public List<SpVillageEntity> queryList(Map<String, Object> map){
		return spVillageDao.queryList(map);
	}

    @Override
    public List<SpVillageEntity> queryListByBean(SpVillageEntity entity) {
        return spVillageDao.queryListByBean(entity);
    }
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return spVillageDao.queryTotal(map);
	}
	
	@Override
	public int save(SpVillageEntity spVillage){
	    //spVillage.setId(Long.valueOf(Utils.uuid()));
		return spVillageDao.save(spVillage);
	}
	
	@Override
	public int update(SpVillageEntity spVillage){
        return spVillageDao.update(spVillage);
	}
	
	@Override
	public int delete(Long id){
        return spVillageDao.delete(id);
	}
	
	@Override
	public int deleteBatch(Long[] ids){
        return spVillageDao.deleteBatch(ids);
	}

	@Override
	public SpVillageEntity queryName(String name) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("name", name);
		return spVillageDao.queryName(map);
	}
	
}
