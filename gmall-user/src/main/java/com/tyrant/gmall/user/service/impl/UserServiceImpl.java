package com.tyrant.gmall.user.service.impl;

import com.tyrant.gmall.user.bean.UmsMember;
import com.tyrant.gmall.user.mapper.UserMapper;
import com.tyrant.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author:profiteur
 * @create 2020-04-15 21:27
 * @description
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAllUser();
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
}
