package com.hxy.sys.dao;

import com.hxy.sys.entity.SpVillageEntity;
import com.hxy.base.dao.BaseDao;

import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * 小区表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-02 16:06:40
 */
@Repository
public interface SpVillageDao extends BaseDao<SpVillageEntity> {
	SpVillageEntity queryName(Map<String,String> map);
}
