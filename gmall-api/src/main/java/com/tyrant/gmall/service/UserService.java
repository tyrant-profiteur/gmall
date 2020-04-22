package com.tyrant.gmall.service;

import com.tyrant.gmall.bean.UmsMember;
import com.tyrant.gmall.bean.UmsMemberReceiveAddress;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    public UmsMember getUserById(int id);

    public void deleteUmsMemberById(int id);

    public UmsMember updateUserById(int id);

    public void insertUser(UmsMember umsMember);
}
