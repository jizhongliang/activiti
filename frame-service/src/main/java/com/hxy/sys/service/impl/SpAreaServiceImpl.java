package com.hxy.sys.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxy.sys.dao.SpAreaDao;
import com.hxy.sys.entity.SpAreaEntity;
import com.hxy.sys.service.SpAreaService;

@Service("spAreaService")
public class SpAreaServiceImpl implements SpAreaService {
    @Autowired
    private SpAreaDao spAreaDao;

    @Override
    public SpAreaEntity queryObject(Integer id) {
        return spAreaDao.queryObject(id);
    }

    @Override
    public List<SpAreaEntity> queryList(Map<String, Object> map) {
        return spAreaDao.queryList(map);
    }

    @Override
    public List<SpAreaEntity> queryListByBean(SpAreaEntity entity) {
        return spAreaDao.queryListByBean(entity);
    }

    @Override
    public int queryTotal(Map<String, Object> map) {
        return spAreaDao.queryTotal(map);
    }

    @Override
    public int save(SpAreaEntity spArea) {
        return spAreaDao.save(spArea);
    }

    @Override
    public int update(SpAreaEntity spArea) {
        return spAreaDao.update(spArea);
    }

    @Override
    public int delete(Integer id) {
        return spAreaDao.delete(id);
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return spAreaDao.deleteBatch(ids);
    }

}
