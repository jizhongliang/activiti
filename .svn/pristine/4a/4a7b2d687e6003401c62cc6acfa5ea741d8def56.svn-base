package com.hxy.sys.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxy.sys.dao.SpCreditDao;
import com.hxy.sys.entity.SpCreditEntity;
import com.hxy.sys.service.SpCreditService;

@Service("spCreditService")
public class SpCreditServiceImpl implements SpCreditService {
    @Autowired
    private SpCreditDao spCreditDao;

    @Override
    public SpCreditEntity queryObject(Long id) {
        return spCreditDao.queryObject(id);
    }

    @Override
    public List<SpCreditEntity> queryList(Map<String, Object> map) {
        return spCreditDao.queryList(map);
    }

    @Override
    public List<SpCreditEntity> queryListByBean(SpCreditEntity entity) {
        return spCreditDao.queryListByBean(entity);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return spCreditDao.queryTotal(map);
    }

    @Override
    public int save(SpCreditEntity spCredit) {
        return spCreditDao.save(spCredit);
    }

    @Override
    public int update(SpCreditEntity spCredit) {
        return spCreditDao.update(spCredit);
    }

    @Override
    public int delete(Long id) {
        return spCreditDao.delete(id);
    }

    @Override
    public int deleteBatch(Long[] ids) {
        return spCreditDao.deleteBatch(ids);
    }

	@Override
	public SpCreditEntity queryXlz(Date time) {
		
		return spCreditDao.queryXlz(time);
	}

}
