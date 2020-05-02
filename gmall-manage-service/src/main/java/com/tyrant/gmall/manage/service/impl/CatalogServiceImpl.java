package com.tyrant.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tyrant.gmall.beans.PmsBaseCatalog1;
import com.tyrant.gmall.beans.PmsBaseCatalog2;
import com.tyrant.gmall.beans.PmsBaseCatalog3;
import com.tyrant.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import com.tyrant.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import com.tyrant.gmall.manage.mapper.PmsBaseCatalog3Mapper;
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
public class CatalogServiceImpl implements CatalogService {
    @Autowired
    private PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    @Autowired
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;
    @Autowired
    private PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> pmsBaseCatalog1s = pmsBaseCatalog1Mapper.selectAll();
        return pmsBaseCatalog1s;
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2ByCatalog1Id(String catalog1Id) {
        Example e = new Example(PmsBaseCatalog2.class);
        e.createCriteria().andEqualTo("catalog1Id",catalog1Id);
        List<PmsBaseCatalog2> pmsBaseCatalog2s = pmsBaseCatalog2Mapper.selectByExample(e);
        return pmsBaseCatalog2s;
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3ByCatalog2Id(String catalog2Id) {
        PmsBaseCatalog3 pmsBaseCatalog3 = new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);
        List<PmsBaseCatalog3> pmsBaseCatalog3s = pmsBaseCatalog3Mapper.select(pmsBaseCatalog3);
        return pmsBaseCatalog3s;
    }
}
