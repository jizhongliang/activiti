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

import com.hxy.base.utils.PageUtils;
import com.hxy.base.utils.Query;
import com.hxy.base.utils.Result;
import com.hxy.sys.entity.SpAreaEntity;
import com.hxy.sys.service.SpAreaService;

/**
 * 省市区
 * 
 * @author hxy
 * @email huangxianyuan@gmail.com
 * @date 2018-02-07 09:34:41
 */
@RestController
@RequestMapping("/sparea")
public class SpAreaController extends BaseController {
    @Autowired
    private SpAreaService spAreaService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("sparea:list")
    public Result list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);

        List<SpAreaEntity> spAreaList = spAreaService.queryList(query);
        int total = spAreaService.queryTotal(query);

        PageUtils pageUtil = new PageUtils(spAreaList, total, query.getLimit(), query.getPage());

        return Result.ok().put("page", pageUtil);
    }

    /**
     * 根据父code查询子code list
     * @param params
     * @return
     */
    @RequestMapping("/list/queryByParentId")
    public Result listQueryByParentId(@RequestBody SpAreaEntity entity) {
        //查询列表数据
        List<SpAreaEntity> spAreaList = spAreaService.queryListByBean(entity);
        return Result.ok().put("data", spAreaList);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("sparea:info")
    public Result info(@PathVariable("id") Integer id) {
        SpAreaEntity spArea = spAreaService.queryObject(id);

        return Result.ok().put("spArea", spArea);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("sparea:save")
    public Result save(@RequestBody SpAreaEntity spArea) {
        spAreaService.save(spArea);

        return Result.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("sparea:update")
    public Result update(@RequestBody SpAreaEntity spArea) {
        spAreaService.update(spArea);

        return Result.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("sparea:delete")
    public Result delete(@RequestBody Integer[] ids) {
        spAreaService.deleteBatch(ids);
        return Result.ok();
    }

}
