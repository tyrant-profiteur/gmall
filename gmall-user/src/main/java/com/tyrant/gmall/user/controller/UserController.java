package com.tyrant.gmall.user.controller;

import com.tyrant.gmall.user.bean.UmsMember;
import com.tyrant.gmall.user.bean.UmsMemberReceiveAddress;
import com.tyrant.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author:profiteur
 * @create 2020-04-15 21:26
 * @description
 **/
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping("getReceiveAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddressList;
    }

    /**
     * 根据 id 查找人员
     * @param id
     * @return
     */
    @RequestMapping("getUserById")
    @ResponseBody
    public UmsMember getUserById(int id){
        UmsMember umsMember = userService.getUserById(id);
        return umsMember;
    }

    /**
     * 根据 id 删除人员
     * @param id
     */
    @RequestMapping("deleteUmsMemberById")
    @ResponseBody
    public void deleteUmsMemberById(int id){
        userService.deleteUmsMemberById(id);
    }

    /**
     * 修改人员信息
     * @param id
     * @return
     */
    @RequestMapping("updateMemberById")
    @ResponseBody
    public UmsMember updateMemberById(int id){
        UmsMember umsMember = userService.updateUserById(id);
        return umsMember;
    }
}
