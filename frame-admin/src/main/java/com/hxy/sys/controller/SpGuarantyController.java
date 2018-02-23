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

import com.hxy.sys.entity.SpGuarantyEntity;
import com.hxy.sys.service.SpGuarantyService;
import com.hxy.base.utils.PageUtils;
import com.hxy.base.utils.Query;
import com.hxy.base.utils.Result;


/**
 * 担保物管理
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-06 10:50:17
 */
@RestController
@RequestMapping("spguaranty")
public class SpGuarantyController extends BaseController{
	@Autowired
	private SpGuarantyService spGuarantyService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("spguaranty:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SpGuarantyEntity> spGuarantyList = spGuarantyService.queryList(query);
		int total = spGuarantyService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(spGuarantyList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("spguaranty:info")
	public Result info(@PathVariable("id") Long id){
		SpGuarantyEntity spGuaranty = spGuarantyService.queryObject(id);
		
		return Result.ok().put("spGuaranty", spGuaranty);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("spguaranty:save")
	public Result save(@RequestBody SpGuarantyEntity spGuaranty){
		spGuarantyService.save(spGuaranty);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("spguaranty:update")
	public Result update(@RequestBody SpGuarantyEntity spGuaranty){
		spGuarantyService.update(spGuaranty);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("spguaranty:delete")
	public Result delete(@RequestBody Long[] ids){
		spGuarantyService.deleteBatch(ids);
		
		return Result.ok();
	}
	
}
