package com.tyrant.gmall.user.service;

import com.tyrant.gmall.user.bean.UmsMember;
import com.tyrant.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @author:profiteur
 * @create 2020-04-15 21:26
 * @description
 **/
public interface UserService {
     List<UmsMember> getAllUser();

     List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String id);
}
