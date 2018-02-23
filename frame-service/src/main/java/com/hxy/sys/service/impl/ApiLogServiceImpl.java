package com.hxy.sys.service.impl;

import com.hxy.base.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.hxy.sys.dao.ApiLogDao;
import com.hxy.sys.entity.ApiLogEntity;
import com.hxy.sys.service.ApiLogService;



@Service("apiLogService")
public class ApiLogServiceImpl implements ApiLogService {
	@Autowired
	private ApiLogDao apiLogDao;
	
	@Override
	public ApiLogEntity queryObject(String id){
		return apiLogDao.queryObject(id);
	}
	
	@Override
	public List<ApiLogEntity> queryList(Map<String, Object> map){
		return apiLogDao.queryList(map);
	}

    @Override
    public List<ApiLogEntity> queryListByBean(ApiLogEntity entity) {
        return apiLogDao.queryListByBean(entity);
    }
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return apiLogDao.queryTotal(map);
	}
	
	@Override
	public int save(ApiLogEntity apiLog){
	    apiLog.setId(Utils.uuid());
		return apiLogDao.save(apiLog);
	}
	
	@Override
	public int update(ApiLogEntity apiLog){
        return apiLogDao.update(apiLog);
	}
	
	@Override
	public int delete(String id){
        return apiLogDao.delete(id);
	}
	
	@Override
	public int deleteBatch(String[] ids){
        return apiLogDao.deleteBatch(ids);
	}
	
}
