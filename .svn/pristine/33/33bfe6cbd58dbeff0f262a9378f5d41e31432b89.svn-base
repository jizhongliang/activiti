package com.hxy.sys.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxy.sys.dao.SpCreditGuarantyDao;
import com.hxy.sys.entity.SpCreditGuarantyEntity;
import com.hxy.sys.service.SpCreditGuarantyService;

@Service("spCreditGuarantyService")
public class SpCreditGuarantyServiceImpl implements SpCreditGuarantyService {
    @Autowired
    private SpCreditGuarantyDao spCreditGuarantyDao;

    @Override
    public SpCreditGuarantyEntity queryObject(Long id) {
        return spCreditGuarantyDao.queryObject(id);
    }

    @Override
    public List<SpCreditGuarantyEntity> queryList(Map<String, Object> map) {
        return spCreditGuarantyDao.queryList(map);
    }

    @Override
    public List<SpCreditGuarantyEntity> queryListByBean(SpCreditGuarantyEntity entity) {
        return spCreditGuarantyDao.queryListByBean(entity);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return spCreditGuarantyDao.queryTotal(map);
    }

    @Override
    public int save(SpCreditGuarantyEntity spCreditGuaranty) {
        return spCreditGuarantyDao.save(spCreditGuaranty);
    }

    @Override
    public int update(SpCreditGuarantyEntity spCreditGuaranty) {
        return spCreditGuarantyDao.update(spCreditGuaranty);
    }

    @Override
    public int delete(Long id) {
        return spCreditGuarantyDao.delete(id);
    }

    @Override
    public int deleteBatch(Long[] ids) {
        return spCreditGuarantyDao.deleteBatch(ids);
    }

}
