package com.hxy.sys.service.impl;

import com.hxy.base.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.hxy.sys.dao.PyLevyApiLogDao;
import com.hxy.sys.entity.PyLevyApiLogEntity;
import com.hxy.sys.service.PyLevyApiLogService;



@Service("pyLevyApiLogService")
public class PyLevyApiLogServiceImpl implements PyLevyApiLogService {
	@Autowired
	private PyLevyApiLogDao pyLevyApiLogDao;
	
	@Override
	public PyLevyApiLogEntity queryObject(String id){
		return pyLevyApiLogDao.queryObject(id);
	}
	
	@Override
	public List<PyLevyApiLogEntity> queryList(Map<String, Object> map){
		return pyLevyApiLogDao.queryList(map);
	}

    @Override
    public List<PyLevyApiLogEntity> queryListByBean(PyLevyApiLogEntity entity) {
        return pyLevyApiLogDao.queryListByBean(entity);
    }
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return pyLevyApiLogDao.queryTotal(map);
	}
	
	@Override
	public int save(PyLevyApiLogEntity pyLevyApiLog){
	    pyLevyApiLog.setId(Utils.uuid());
		return pyLevyApiLogDao.save(pyLevyApiLog);
	}
	
	@Override
	public int update(PyLevyApiLogEntity pyLevyApiLog){
        return pyLevyApiLogDao.update(pyLevyApiLog);
	}
	
	@Override
	public int delete(String id){
        return pyLevyApiLogDao.delete(id);
	}
	
	@Override
	public int deleteBatch(String[] ids){
        return pyLevyApiLogDao.deleteBatch(ids);
	}
	
}
