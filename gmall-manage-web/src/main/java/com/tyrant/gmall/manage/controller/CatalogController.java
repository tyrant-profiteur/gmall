package com.tyrant.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tyrant.gmall.beans.PmsBaseCatalog1;
import com.tyrant.gmall.beans.PmsBaseCatalog2;
import com.tyrant.gmall.beans.PmsBaseCatalog3;
import com.tyrant.gmall.service.manage.CatalogService;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author:profiteur
 * @create 2020-05-02 9:35
 * @description
 **/
@Controller
@CrossOrigin
public class CatalogController {

   @Reference
   private CatalogService catalogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> catalog1s = catalogService.getCatalog1();
        return catalog1s;
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(String catalog1Id){
        List<PmsBaseCatalog2> catalog2s = catalogService.getCatalog2ByCatalog1Id(catalog1Id);
        return catalog2s;
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(String catalog2Id){
        List<PmsBaseCatalog3> catalog3s = catalogService.getCatalog3ByCatalog2Id(catalog2Id);
        return catalog3s;
    }
}
