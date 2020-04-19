package com.tyrant.gmall.user.service.impl;

import com.tyrant.gmall.user.bean.UmsMember;
import com.tyrant.gmall.user.bean.UmsMemberReceiveAddress;
import com.tyrant.gmall.user.mapper.UmsMemberReceiveAddressMapper;
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
}
