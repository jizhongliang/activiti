package com.hxy.sys.service.impl;

import com.hxy.base.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.hxy.sys.dao.SpContractDao;
import com.hxy.sys.entity.SpContractEntity;
import com.hxy.sys.service.SpContractService;



@Service("spContractService")
public class SpContractServiceImpl implements SpContractService {
	@Autowired
	private SpContractDao spContractDao;
	
	@Override
	public SpContractEntity queryObject(Long id){
		return spContractDao.queryObject(id);
	}
	
	@Override
	public List<SpContractEntity> queryList(Map<String, Object> map){
		return spContractDao.queryList(map);
	}

    @Override
    public List<SpContractEntity> queryListByBean(SpContractEntity entity) {
        return spContractDao.queryListByBean(entity);
    }
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return spContractDao.queryTotal(map);
	}
	
	@Override
	public int save(SpContractEntity spContract){
	    spContract.setId(Long.valueOf(Utils.uuid()));
		return spContractDao.save(spContract);
	}
	
	@Override
	public int update(SpContractEntity spContract){
        return spContractDao.update(spContract);
	}
	
	@Override
	public int delete(Long id){
        return spContractDao.delete(id);
	}
	
	@Override
	public int deleteBatch(Long[] ids){
        return spContractDao.deleteBatch(ids);
	}
	
}
