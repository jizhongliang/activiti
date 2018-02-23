package com.hxy.sys.service.impl;

import com.hxy.base.common.Constant;
import com.hxy.base.page.Page;
import com.hxy.base.page.PageHelper;
import com.hxy.base.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.hxy.sys.dao.SpUserDao;
import com.hxy.sys.entity.SpUserEntity;
import com.hxy.sys.entity.SpVillageEntity;
import com.hxy.sys.service.SpUserService;
import com.hxy.sys.service.SpVillageService;



@Service("spUserService")
public class SpUserServiceImpl implements SpUserService {
	@Autowired
	private SpUserDao spUserDao;
	@Autowired
	private SpVillageService spVillageService;
	@Override
	public SpUserEntity queryObject(Long id){
		return spUserDao.queryObject(id);
	}
	
	@Override
	public Page<SpUserEntity> query(SpUserEntity spUserEntity, int pageNum){
		PageHelper.startPage(pageNum,Constant.pageSize);
		spUserDao.queryListByBean(spUserEntity);
    	
		return PageHelper.endPage();
	}

    @Override
    public List<SpUserEntity> queryListByBean(SpUserEntity entity) {
        return spUserDao.queryListByBean(entity);
    }
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return spUserDao.queryTotal(map);
	}
	
	@Override
	public int save(SpUserEntity spUser){
	    spUser.setId(Long.valueOf(Utils.uuid()));
		return spUserDao.save(spUser);
	}
	
	@Override
	public int update(SpUserEntity spUser){
        return spUserDao.update(spUser);
	}
	
	@Override
	public int delete(Long id){
        return spUserDao.delete(id);
	}
	
	@Override
	public int deleteBatch(Long[] ids){
        return spUserDao.deleteBatch(ids);
	}

	@Override
	public List<SpUserEntity> queryList(Map<String, Object> map) {
		
		return spUserDao.queryList(map);
	}
	
}
