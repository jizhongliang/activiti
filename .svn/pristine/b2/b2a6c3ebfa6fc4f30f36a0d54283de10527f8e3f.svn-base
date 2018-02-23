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

import com.hxy.sys.entity.SpUserEntity;
import com.hxy.sys.service.SpUserService;
import com.hxy.base.utils.PageUtils;
import com.hxy.base.utils.Query;
import com.hxy.base.utils.Result;


/**
 * 用户信息表
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-07 16:18:54
 */
@RestController
@RequestMapping("spuser")
public class SpUserController extends BaseController{
	@Autowired
	private SpUserService spUserService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("spuser:list")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SpUserEntity> spUserList = spUserService.queryList(query);
		int total = spUserService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(spUserList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("spuser:info")
	public Result info(@PathVariable("id") Long id){
		SpUserEntity spUser = spUserService.queryObject(id);
		
		return Result.ok().put("spUser", spUser);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("spuser:save")
	public Result save(@RequestBody SpUserEntity spUser){
		spUserService.save(spUser);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("spuser:update")
	public Result update(@RequestBody SpUserEntity spUser){
		spUserService.update(spUser);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("spuser:delete")
	public Result delete(@RequestBody Long[] ids){
		spUserService.deleteBatch(ids);
		
		return Result.ok();
	}
	
}
