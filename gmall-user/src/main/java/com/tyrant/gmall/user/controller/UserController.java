package com.tyrant.gmall.user.controller;

import com.tyrant.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
