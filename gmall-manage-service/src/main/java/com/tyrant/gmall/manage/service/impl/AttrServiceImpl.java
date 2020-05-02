package com.tyrant.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tyrant.gmall.beans.*;
import com.tyrant.gmall.manage.mapper.*;
import com.tyrant.gmall.service.manage.AttrService;
import com.tyrant.gmall.service.manage.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author:profiteur
 * @create 2020-05-02 10:20
 * @description
 **/
@Service
public class AttrServiceImpl implements AttrService {
    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;
    @Autowired
    private PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> getAttrInfoListByCatalog3Id(String catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> attrInfos = pmsBaseAttrInfoMapper.select(pmsBaseAttrInfo);
        return attrInfos;
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueListByAttrId(String attrId) {
        PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
        pmsBaseAttrValue.setAttrId(attrId);
        List<PmsBaseAttrValue> attrValues = pmsBaseAttrValueMapper.select(pmsBaseAttrValue);
        return attrValues;
    }
}
