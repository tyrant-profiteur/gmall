package com.tyrant.gmall.service.manage;

import com.tyrant.gmall.beans.PmsBaseCatalog1;
import com.tyrant.gmall.beans.PmsBaseCatalog2;
import com.tyrant.gmall.beans.PmsBaseCatalog3;

import java.util.List;

/**
 * @author:profiteur
 * @create 2020-05-02 10:07
 * @description
 **/
public interface CatalogService {
    /**
     * 获取一级分类
     * @return
     */
    List<PmsBaseCatalog1> getCatalog1();

    /**
     * 获取二级分类
     * @return
     */
    List<PmsBaseCatalog2> getCatalog2ByCatalog1Id(String catalog1Id);

    /**
     * 获取三级分类
     * @return
     */
    List<PmsBaseCatalog3> getCatalog3ByCatalog2Id(String catalog2Id);
}
