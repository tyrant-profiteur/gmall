package com.tyrant.gmall.user.service;

import com.tyrant.gmall.user.bean.UmsMember;

import java.util.List;

/**
 * @author:profiteur
 * @create 2020-04-15 21:26
 * @description
 **/
public interface UserService {
     List<UmsMember> getAllUser();

     UmsMember getUserById(int id);

     void deleteUmsMemberById(int id);

     UmsMember updateUserById(int id);
}
