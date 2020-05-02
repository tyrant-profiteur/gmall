package com.tyrant.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tyrant.gmall.beans.UmsMember;
import com.tyrant.gmall.beans.UmsMemberReceiveAddress;
import com.tyrant.gmall.service.user.UserService;
import com.tyrant.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.tyrant.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author:profiteurn
 * @create 2020-04-15 21:27
 * @description
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        //return userMapper.selectAllUser();
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",memberId);
        return umsMemberReceiveAddressMapper.selectByExample(e);
    }

    @Override
    public UmsMember getUserById(int id) {
        return userMapper.selectUserById(id);
    }

    @Override
    public void deleteUmsMemberById(int id) {
        Example e = new Example(UmsMember.class);
        e.createCriteria().andEqualTo("id",id);
        userMapper.deleteByExample(e);
    }

    @Override
    public UmsMember updateUserById(int id) {
        UmsMember umsMember = userMapper.selectUserById(id);
        umsMember.setUsername("tyrant");
        userMapper.updateByPrimaryKey(umsMember);
        return umsMember;
    }

    @Override
    public void insertUser(UmsMember umsMember) {
        userMapper.insert(umsMember);
    }
}
