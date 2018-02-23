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

import com.hxy.sys.entity.ApiLogEntity;
import com.hxy.sys.service.ApiLogService;
import com.hxy.base.utils.PageUtils;
import com.hxy.base.utils.Query;
import com.hxy.base.utils.Result;


/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2017-12-23 11:16:00
 */
@RestController
@RequestMapping("apilog")
public class ApiLogController extends BaseController{
	@Autowired
	private ApiLogService apiLogService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("apilog:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<ApiLogEntity> apiLogList = apiLogService.queryList(query);
		int total = apiLogService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(apiLogList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("apilog:info")
	public Result info(@PathVariable("id") String id){
		ApiLogEntity apiLog = apiLogService.queryObject(id);
		
		return Result.ok().put("apiLog", apiLog);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("apilog:save")
	public Result save(@RequestBody ApiLogEntity apiLog){
		apiLogService.save(apiLog);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("apilog:update")
	public Result update(@RequestBody ApiLogEntity apiLog){
		apiLogService.update(apiLog);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("apilog:delete")
	public Result delete(@RequestBody String[] ids){
		apiLogService.deleteBatch(ids);
		
		return Result.ok();
	}
	
}
