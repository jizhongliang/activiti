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

import com.hxy.sys.entity.SpBondEntity;
import com.hxy.sys.service.SpBondService;
import com.hxy.base.utils.PageUtils;
import com.hxy.base.utils.Query;
import com.hxy.base.utils.Result;


/**
 * 担保人管理
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-06 14:03:37
 */
@RestController
@RequestMapping("spbond")
public class SpBondController extends BaseController{
	@Autowired
	private SpBondService spBondService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("spbond:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SpBondEntity> spBondList = spBondService.queryList(query);
		int total = spBondService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(spBondList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("spbond:info")
	public Result info(@PathVariable("id") Long id){
		SpBondEntity spBond = spBondService.queryObject(id);
		
		return Result.ok().put("spBond", spBond);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("spbond:save")
	public Result save(@RequestBody SpBondEntity spBond){
		spBondService.save(spBond);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("spbond:update")
	public Result update(@RequestBody SpBondEntity spBond){
		spBondService.update(spBond);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("spbond:delete")
	public Result delete(@RequestBody Long[] ids){
		spBondService.deleteBatch(ids);
		
		return Result.ok();
	}
	
}
