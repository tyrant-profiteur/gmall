package com.tyrant.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tyrant.gmall.beans.PmsProductInfo;
import com.tyrant.gmall.beans.PmsProductSaleAttr;
import com.tyrant.gmall.manage.mapper.PmsProductInfoMapper;
import com.tyrant.gmall.manage.mapper.PmsProductSaleAttrMapper;
import com.tyrant.gmall.service.manage.SpuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author:profiteur
 * @create 2020-05-08 22:07
 * @description
 **/
@Service
public class SpuServiceImpl implements SpuService {
    @Autowired
    private PmsProductInfoMapper pmsProductInfoMapper;
    @Autowired
    private PmsProductSaleAttrMapper pmsProductSaleAttrMapper;

    @Override
    public List<PmsProductInfo> getSpuList(String catalog3Id) {
        PmsProductInfo productInfo = new PmsProductInfo();
        productInfo.setCatalog3Id(catalog3Id);
        List<PmsProductInfo> spuList = pmsProductInfoMapper.select(productInfo);
        return spuList;
    }

    @Override
    public List<PmsProductSaleAttr> getSpuSaleAttrList(String spuId) {
        PmsProductSaleAttr productSaleAttr = new PmsProductSaleAttr();
        productSaleAttr.setProductId(spuId);
        List<PmsProductSaleAttr> productSaleAttrList = pmsProductSaleAttrMapper.select(productSaleAttr);
        return productSaleAttrList;
    }
}
