package com.hxy.sys.service.impl;

import com.hxy.base.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.hxy.sys.dao.SpBondDao;
import com.hxy.sys.entity.SpBondEntity;
import com.hxy.sys.service.SpBondService;



@Service("spBondService")
public class SpBondServiceImpl implements SpBondService {
	@Autowired
	private SpBondDao spBondDao;
	
	@Override
	public SpBondEntity queryObject(Long id){
		return spBondDao.queryObject(id);
	}
	
	@Override
	public List<SpBondEntity> queryList(Map<String, Object> map){
		return spBondDao.queryList(map);
	}

    @Override
    public List<SpBondEntity> queryListByBean(SpBondEntity entity) {
        return spBondDao.queryListByBean(entity);
    }
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return spBondDao.queryTotal(map);
	}
	
	@Override
	public int save(SpBondEntity spBond){
	    spBond.setId(Long.valueOf(Utils.uuid()));
		return spBondDao.save(spBond);
	}
	
	@Override
	public int update(SpBondEntity spBond){
        return spBondDao.update(spBond);
	}
	
	@Override
	public int delete(Long id){
        return spBondDao.delete(id);
	}
	
	@Override
	public int deleteBatch(Long[] ids){
        return spBondDao.deleteBatch(ids);
	}
	
}
