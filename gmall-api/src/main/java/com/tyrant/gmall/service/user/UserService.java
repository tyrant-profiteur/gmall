package com.tyrant.gmall.service.user;

import com.tyrant.gmall.beans.UmsMember;
import com.tyrant.gmall.beans.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    public UmsMember getUserById(int id);

    public void deleteUmsMemberById(int id);

    public UmsMember updateUserById(int id);

    public void insertUser(UmsMember umsMember);
}
