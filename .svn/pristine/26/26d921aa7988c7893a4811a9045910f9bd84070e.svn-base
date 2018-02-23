/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package com.hxy.sys.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hxy.base.annotation.SysLog;
import com.hxy.base.page.Page;
import com.hxy.base.utils.DateUtils;

import com.hxy.base.utils.PageUtils;
import com.hxy.base.utils.Query;
import com.hxy.base.utils.Result;
import com.hxy.base.utils.Utils;
import com.hxy.dto.CreditListDto;
import com.hxy.sys.entity.OrganEntity;
import com.hxy.sys.entity.SpAreaEntity;
import com.hxy.sys.entity.SpCreditEntity;
import com.hxy.sys.entity.SpUserEntity;
import com.hxy.sys.entity.SpVillageEntity;
import com.hxy.sys.service.OrganService;
import com.hxy.sys.service.SpAreaService;
import com.hxy.sys.service.SpCreditService;
import com.hxy.sys.service.SpUserService;
import com.hxy.sys.service.SpVillageService;
import com.hxy.utils.UserUtils;

/**
 * 
 * @author jinlilong
 * @version $Id: CreditController.java, v 0.1 2018年2月6日 下午1:44:09 jinlilong Exp $
 */
@RestController
@RequestMapping("/credit")
public class CreditController extends BaseController {
	@Autowired
	private SpCreditService spCreditService;
	@Autowired
	private OrganService organService;
	@Autowired
	private SpUserService spUserService;
	@Autowired
	private SpVillageService spVillageService;
	@Autowired
    private SpAreaService spAreaService;
    @RequestMapping(value = "/list/pending")
    @RequiresPermissions("credit:list:pending")
    @SysLog("待处理额度审批列表")
    public Result list(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);
        List<CreditListDto> dataList = new ArrayList<CreditListDto>();
        CreditListDto entity = new CreditListDto();
        entity.setAddDate(DateUtils.format(new Date(), DateUtils.DATE_TIME_PATTERN));
        entity.setAddUserName("张三");
        entity.setContractNum("11111");
        entity.setPhone("13760909091");
        entity.setRealName("李四");
        entity.setStatus("待审批");
        entity.setVillageName("测试项目");
        dataList.add(entity);
        int total = 1;
        PageUtils pageUtil = new PageUtils(dataList, total, query.getLimit(), query.getPage());
        return Result.ok().put("page", pageUtil);
    }
    @RequestMapping("/queryxlz")
	public Result queryxlz(){
    	SpCreditEntity spCreditEntity=spCreditService.queryXlz(new Date());
    	String bapId=UserUtils.getCurrentUser().getBapid();
    	OrganEntity organEntity=organService.queryObject(bapId);
    	String zone="";
    	if(null==organEntity){
    		zone="";
    	}else{
    		zone=organEntity.getZone();
    	}
    	Map<String,String> map=new HashMap<String,String>();
    	String xlz="";
		if(null!=spCreditEntity){
			if(spCreditEntity.getXlz()<9){
				xlz="00"+(spCreditEntity.getXlz()+1);
			}else if(spCreditEntity.getXlz()<99&&spCreditEntity.getXlz()>9){
				xlz="0"+(spCreditEntity.getXlz()+1);
			}else if(spCreditEntity.getXlz()>=99){
				if(spCreditEntity.getXlz()==999){
					xlz="001";
				}else{
					xlz=String.valueOf(spCreditEntity.getXlz()+1);
				}
			}
		}else{
			xlz="001";	
		}
		map.put("xlz",xlz);
		map.put("zone",zone);
		return Result.ok().put("map",map);
	}
    
    
    /**
     * 选择客户弹框
     * @param model
     * @return
     */
    @RequestMapping("model")
    public ModelAndView info(SpUserEntity spUserEntity,HttpServletRequest request){
   	ModelAndView mav = new ModelAndView();
    	String villageName=request.getParameter("villageId");
    	if(null!=villageName&&!"".equals(villageName)){
    		SpVillageEntity spVillageEntitys=spVillageService.queryName(villageName);
    		if(null!=spVillageEntitys){
    			spUserEntity.setVillageId(spVillageEntitys.getId());
    		}
    	}
    	 int pageNum = Utils.parseInt(request.getParameter("pageNum"), 1);
    	 spUserEntity.setIdNo(request.getParameter("idNo")==null?"":request.getParameter("idNo"));
    	 spUserEntity.setName(request.getParameter("name")==null?"":request.getParameter("name"));
    	 spUserEntity.setPhone(request.getParameter("phone")==null?"":request.getParameter("phone"));
    	Page<SpUserEntity> page=spUserService.query(spUserEntity, pageNum);
    	for (int i = 0; i <page.getResult().size(); i++) {
     		SpVillageEntity spVillageEntity=spVillageService.queryObject(page.getResult().get(i).getVillageId());
     		if(null!=spVillageEntity&&null!=spVillageEntity.getName()){
     			page.getResult().get(i).setEducation(spVillageEntity.getName());
     		}else{
     			page.getResult().get(i).setEducation("");
     		}
 		}
    	 mav.setViewName("credit/modelInfo.jsp");
    	 mav.addObject("page",page);
    	 return mav;
    }
    
    @SuppressWarnings("null")
    @RequestMapping("/xzkh")
   	public Result xzkh(@RequestBody SpUserEntity entity){
    	SpUserEntity spUserEntity=spUserService.queryObject(entity.getId());
    	SpAreaEntity spAreaEntity = new SpAreaEntity();
    	SpAreaEntity spAreaEntitys=new SpAreaEntity();
    	SpVillageEntity	spVillageEntity=new SpVillageEntity();
    	if(null==spUserEntity){
    		spUserEntity.setName("");
    	}else{
    			spVillageEntity=spVillageService.queryObject(spUserEntity.getVillageId());
    		if(null!=spVillageEntity&&null!=spVillageEntity.getArea()&&null!=spVillageEntity.getCity()&&!"".equals(spVillageEntity.getArea())&&!"".equals(spVillageEntity.getCity())){
    			 spAreaEntity=spAreaService.queryObject(Integer.valueOf(spVillageEntity.getArea()));
    			 spAreaEntitys=spAreaService.queryObject(Integer.valueOf(spVillageEntity.getCity()));
    		if(null==spAreaEntity){
    			spAreaEntity.setAreaName("");
    		}
    		if(null==spAreaEntitys){
    			spAreaEntitys.setAreaName("");
    		}
    		}
    	}
    	Map<String,Object> map=new HashMap<String,Object>();
    	map.put("user", spUserEntity);
		map.put("spAreaEntity",spAreaEntity);
		map.put("spAreaEntitys",spAreaEntitys);
		map.put("spVillageEntity",spVillageEntity);
   		return Result.ok().put("map",map);
   	}
     

       
}
