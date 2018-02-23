package com.hxy.sys.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hxy.sys.entity.SpVillageUpdateLogEntity;
import com.hxy.sys.service.SpVillageUpdateLogService;
import com.hxy.base.utils.PageUtils;
import com.hxy.base.utils.Query;
import com.hxy.base.utils.Result;


/**
 * 小区表修改日志
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-02 16:06:40
 */
@RestController
@RequestMapping("spvillageupdatelog")
public class SpVillageUpdateLogController extends BaseController{
	@Autowired
	private SpVillageUpdateLogService spVillageUpdateLogService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("spvillageupdatelog:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SpVillageUpdateLogEntity> spVillageUpdateLogList = spVillageUpdateLogService.queryList(query);
		int total = spVillageUpdateLogService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(spVillageUpdateLogList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("spvillageupdatelog:info")
	public Result info(@PathVariable("id") Long id){
		SpVillageUpdateLogEntity spVillageUpdateLog = spVillageUpdateLogService.queryObject(id);
		
		return Result.ok().put("spVillageUpdateLog", spVillageUpdateLog);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("spvillageupdatelog:save")
	public Result save(@RequestBody SpVillageUpdateLogEntity spVillageUpdateLog){
		spVillageUpdateLogService.save(spVillageUpdateLog);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("spvillageupdatelog:update")
	public Result update(@RequestBody SpVillageUpdateLogEntity spVillageUpdateLog){
		spVillageUpdateLogService.update(spVillageUpdateLog);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("spvillageupdatelog:delete")
	public Result delete(@RequestBody Long[] ids){
		spVillageUpdateLogService.deleteBatch(ids);
		
		return Result.ok();
	}
	
}
