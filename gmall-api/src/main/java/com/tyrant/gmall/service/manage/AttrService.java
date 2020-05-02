package com.tyrant.gmall.service.manage;

import com.tyrant.gmall.beans.*;

import java.util.List;

/**
 * @author:profiteur
 * @create 2020-05-02 10:07
 * @description
 **/
public interface AttrService {
    /**
     * 获取平台属性
     * @return
     */
    List<PmsBaseAttrInfo> getAttrInfoListByCatalog3Id(String catalog3Id);

    List<PmsBaseAttrValue> getAttrValueListByAttrId(String attrId);
}
