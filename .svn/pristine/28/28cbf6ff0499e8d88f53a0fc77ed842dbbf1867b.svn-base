package com.hxy.sys.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxy.sys.dao.SpCreditBondDao;
import com.hxy.sys.entity.SpCreditBondEntity;
import com.hxy.sys.service.SpCreditBondService;

@Service("spCreditBondService")
public class SpCreditBondServiceImpl implements SpCreditBondService {
    @Autowired
    private SpCreditBondDao spCreditBondDao;

    @Override
    public SpCreditBondEntity queryObject(Long id) {
        return spCreditBondDao.queryObject(id);
    }

    @Override
    public List<SpCreditBondEntity> queryList(Map<String, Object> map) {
        return spCreditBondDao.queryList(map);
    }

    @Override
    public List<SpCreditBondEntity> queryListByBean(SpCreditBondEntity entity) {
        return spCreditBondDao.queryListByBean(entity);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return spCreditBondDao.queryTotal(map);
    }

    @Override
    public int save(SpCreditBondEntity spCreditBond) {
        return spCreditBondDao.save(spCreditBond);
    }

    @Override
    public int update(SpCreditBondEntity spCreditBond) {
        return spCreditBondDao.update(spCreditBond);
    }

    @Override
    public int delete(Long id) {
        return spCreditBondDao.delete(id);
    }

    @Override
    public int deleteBatch(Long[] ids) {
        return spCreditBondDao.deleteBatch(ids);
    }

}
