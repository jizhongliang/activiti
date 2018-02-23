package com.hxy.sys.controller;

import com.hxy.base.utils.PageUtils;
import com.hxy.base.utils.Query;
import com.hxy.base.utils.Result;
import com.hxy.sys.entity.SpContractEntity;
import com.hxy.sys.service.SpContractService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * 合同表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-05 14:13:25
 */
@RestController
@RequestMapping("spcontract")
public class SpContractController extends BaseController{
	@Autowired
	private SpContractService spContractService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("spcontract:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SpContractEntity> spContractList = spContractService.queryList(query);
		int total = spContractService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(spContractList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("spcontract:info")
	public Result info(@PathVariable("id") Long id){
		SpContractEntity spContract = spContractService.queryObject(id);
		
		return Result.ok().put("spContract", spContract);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("spcontract:save")
	public Result save(@RequestBody SpContractEntity spContract){
		spContractService.save(spContract);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("spcontract:update")
	public Result update(@RequestBody SpContractEntity spContract){
		spContractService.update(spContract);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("spcontract:delete")
	public Result delete(@RequestBody Long[] ids){
		spContractService.deleteBatch(ids);
		
		return Result.ok();
	}
	
}
