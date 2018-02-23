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

import com.hxy.sys.entity.PyLevyApiLogEntity;
import com.hxy.sys.service.PyLevyApiLogService;
import com.hxy.base.utils.PageUtils;
import com.hxy.base.utils.Query;
import com.hxy.base.utils.Result;


/**
 * 
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2017-12-22 17:30:29
 */
@RestController
@RequestMapping("pylevyapilog")
public class PyLevyApiLogController extends BaseController{
	@Autowired
	private PyLevyApiLogService pyLevyApiLogService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("pylevyapilog:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<PyLevyApiLogEntity> pyLevyApiLogList = pyLevyApiLogService.queryList(query);
		int total = pyLevyApiLogService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(pyLevyApiLogList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("pylevyapilog:info")
	public Result info(@PathVariable("id") String id){
		PyLevyApiLogEntity pyLevyApiLog = pyLevyApiLogService.queryObject(id);
		
		return Result.ok().put("pyLevyApiLog", pyLevyApiLog);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("pylevyapilog:save")
	public Result save(@RequestBody PyLevyApiLogEntity pyLevyApiLog){
		pyLevyApiLogService.save(pyLevyApiLog);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("pylevyapilog:update")
	public Result update(@RequestBody PyLevyApiLogEntity pyLevyApiLog){
		pyLevyApiLogService.update(pyLevyApiLog);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("pylevyapilog:delete")
	public Result delete(@RequestBody String[] ids){
		pyLevyApiLogService.deleteBatch(ids);
		
		return Result.ok();
	}
	
}
