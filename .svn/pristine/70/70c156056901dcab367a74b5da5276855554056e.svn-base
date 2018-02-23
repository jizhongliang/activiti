package com.hxy.sys.service.impl;

import com.hxy.base.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.hxy.sys.dao.SpGuarantyDao;
import com.hxy.sys.entity.SpGuarantyEntity;
import com.hxy.sys.service.SpGuarantyService;



@Service("spGuarantyService")
public class SpGuarantyServiceImpl implements SpGuarantyService {
	@Autowired
	private SpGuarantyDao spGuarantyDao;
	
	@Override
	public SpGuarantyEntity queryObject(Long id){
		return spGuarantyDao.queryObject(id);
	}
	
	@Override
	public List<SpGuarantyEntity> queryList(Map<String, Object> map){
		return spGuarantyDao.queryList(map);
	}

    @Override
    public List<SpGuarantyEntity> queryListByBean(SpGuarantyEntity entity) {
        return spGuarantyDao.queryListByBean(entity);
    }
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return spGuarantyDao.queryTotal(map);
	}
	
	@Override
	public int save(SpGuarantyEntity spGuaranty){
	    spGuaranty.setId(Long.valueOf(Utils.uuid()));
		return spGuarantyDao.save(spGuaranty);
	}
	
	@Override
	public int update(SpGuarantyEntity spGuaranty){
        return spGuarantyDao.update(spGuaranty);
	}
	
	@Override
	public int delete(Long id){
        return spGuarantyDao.delete(id);
	}
	
	@Override
	public int deleteBatch(Long[] ids){
        return spGuarantyDao.deleteBatch(ids);
	}
	
}
