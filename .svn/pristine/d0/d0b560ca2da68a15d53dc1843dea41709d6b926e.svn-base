package com.hxy.sys.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.hxy.activiti.annotation.ActTable;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hxy.sys.entity.SpVillageEntity;
import com.hxy.sys.service.SpVillageService;
import com.hxy.base.utils.PageUtils;
import com.hxy.base.utils.Query;
import com.hxy.base.utils.Result;


/**
 * 小区表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-02 16:06:40
 */
@RestController
@RequestMapping("spvillage")
@ActTable(tableName="leaveaply",pkName = "id")
public class SpVillageController extends BaseController{
	@Autowired
	private SpVillageService spVillageService;


	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("spvillage:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SpVillageEntity> spVillageList = spVillageService.queryList(query);
		int total = spVillageService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(spVillageList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("spvillage:info")
	public Result info(@PathVariable("id") Long id){
		SpVillageEntity spVillage = spVillageService.queryObject(id);
		
		return Result.ok().put("spVillage", spVillage);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("spvillage:save")
	public Result save(@RequestBody SpVillageEntity spVillage){
		spVillage.setOrgId((long) 11111111);
		spVillage.setType(1);
		spVillage.setStatus(1);
		spVillage.setIsBlack(0);
		spVillage.setIsNeedSign(0);
		spVillage.setIsUsed(1);
		spVillage.setIsCaution(0);
		spVillage.setIsCredentials(0);
		spVillage.setIsDelete(0);
		spVillage.setCreateTime(new Date());
		spVillage.setStartUserId((long) 11111111);
		spVillage.setStartTime(new Date());

		spVillageService.save(spVillage);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("spvillage:update")
	public Result update(@RequestBody SpVillageEntity spVillage){
		spVillageService.update(spVillage);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("spvillage:delete")
	public Result delete(@RequestBody Long[] ids){
		spVillageService.deleteBatch(ids);
		
		return Result.ok();
	}
	
}
