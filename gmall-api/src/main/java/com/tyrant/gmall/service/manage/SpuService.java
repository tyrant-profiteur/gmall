package com.tyrant.gmall.service.manage;

import com.tyrant.gmall.beans.PmsProductInfo;
import com.tyrant.gmall.beans.PmsProductSaleAttr;

import java.util.List;

/**
 * @author:profiteur
 * @create 2020-05-08 22:07
 * @description
 **/
public interface SpuService {
    List<PmsProductInfo> getSpuList(String catalog3Id);

    List<PmsProductSaleAttr> getSpuSaleAttrList(String spuId);
}
