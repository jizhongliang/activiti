package com.hxy.sys.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxy.sys.dao.SpCreditRereqDao;
import com.hxy.sys.entity.SpCreditRereqEntity;
import com.hxy.sys.service.SpCreditRereqService;

@Service("spCreditRereqService")
public class SpCreditRereqServiceImpl implements SpCreditRereqService {
    @Autowired
    private SpCreditRereqDao spCreditRereqDao;

    @Override
    public SpCreditRereqEntity queryObject(Long id) {
        return spCreditRereqDao.queryObject(id);
    }

    @Override
    public List<SpCreditRereqEntity> queryList(Map<String, Object> map) {
        return spCreditRereqDao.queryList(map);
    }

    @Override
    public List<SpCreditRereqEntity> queryListByBean(SpCreditRereqEntity entity) {
        return spCreditRereqDao.queryListByBean(entity);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return spCreditRereqDao.queryTotal(map);
    }

    @Override
    public int save(SpCreditRereqEntity spCreditRereq) {
        return spCreditRereqDao.save(spCreditRereq);
    }

    @Override
    public int update(SpCreditRereqEntity spCreditRereq) {
        return spCreditRereqDao.update(spCreditRereq);
    }

    @Override
    public int delete(Long id) {
        return spCreditRereqDao.delete(id);
    }

    @Override
    public int deleteBatch(Long[] ids) {
        return spCreditRereqDao.deleteBatch(ids);
    }

}
