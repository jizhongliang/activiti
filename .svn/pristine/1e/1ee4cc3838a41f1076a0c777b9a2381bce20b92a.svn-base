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

import com.hxy.sys.entity.SpVillageBlackLogEntity;
import com.hxy.sys.service.SpVillageBlackLogService;
import com.hxy.base.utils.PageUtils;
import com.hxy.base.utils.Query;
import com.hxy.base.utils.Result;


/**
 * 小区拉黑日志表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-02 16:06:40
 */
@RestController
@RequestMapping("spvillageblacklog")
public class SpVillageBlackLogController extends BaseController{
	@Autowired
	private SpVillageBlackLogService spVillageBlackLogService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("spvillageblacklog:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SpVillageBlackLogEntity> spVillageBlackLogList = spVillageBlackLogService.queryList(query);
		int total = spVillageBlackLogService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(spVillageBlackLogList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("spvillageblacklog:info")
	public Result info(@PathVariable("id") Long id){
		SpVillageBlackLogEntity spVillageBlackLog = spVillageBlackLogService.queryObject(id);
		
		return Result.ok().put("spVillageBlackLog", spVillageBlackLog);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("spvillageblacklog:save")
	public Result save(@RequestBody SpVillageBlackLogEntity spVillageBlackLog){
		spVillageBlackLogService.save(spVillageBlackLog);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("spvillageblacklog:update")
	public Result update(@RequestBody SpVillageBlackLogEntity spVillageBlackLog){
		spVillageBlackLogService.update(spVillageBlackLog);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("spvillageblacklog:delete")
	public Result delete(@RequestBody Long[] ids){
		spVillageBlackLogService.deleteBatch(ids);
		
		return Result.ok();
	}
	
}
