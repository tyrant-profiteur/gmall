package com.tyrant.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tyrant.gmall.beans.PmsBaseAttrInfo;
import com.tyrant.gmall.beans.PmsBaseAttrValue;
import com.tyrant.gmall.service.manage.AttrService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author:profiteur
 * @create 2020-05-02 15:39
 * @description
 **/
@Controller
@CrossOrigin
public class AttrController {
    @Reference
    private AttrService attrService;

    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
        List<PmsBaseAttrInfo> baseAttrInfos = attrService.getAttrInfoListByCatalog3Id(catalog3Id);
        return baseAttrInfos;
    }

    @RequestMapping("getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> attrValueList(String attrId){
        List<PmsBaseAttrValue> attrValues = attrService.getAttrValueListByAttrId(attrId);
        return attrValues;
    }

    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo){
        String result = attrService.saveAttrInfo(pmsBaseAttrInfo);
        return result;
    }
}
