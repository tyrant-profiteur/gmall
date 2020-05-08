package com.tyrant.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tyrant.gmall.beans.PmsProductInfo;
import com.tyrant.gmall.beans.PmsProductSaleAttr;
import com.tyrant.gmall.service.manage.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author:profiteur
 * @create 2020-05-08 22:02
 * @description
 **/
@Controller
@CrossOrigin
public class SpuController {
    @Reference
    private SpuService spuService;

    @RequestMapping("spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(String catalog3Id){
        List<PmsProductInfo> spuList = spuService.getSpuList(catalog3Id);
        return spuList;
    }

    @ResponseBody
    @RequestMapping("spuSaleAttrList")
    public List<PmsProductSaleAttr> spuSaleAttrList(String spuId){
        List<PmsProductSaleAttr> spuSaleAttrList = spuService.getSpuSaleAttrList(spuId);
        return spuSaleAttrList;
    }
}
