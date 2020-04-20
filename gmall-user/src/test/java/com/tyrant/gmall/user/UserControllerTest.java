package com.tyrant.gmall.user;

import com.tyrant.gmall.user.bean.UmsMember;
import com.tyrant.gmall.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class UserControllerTest {
    @Autowired
    private UserService userService;

    @Test
    void saveUser(){
        UmsMember umsMember = new UmsMember();
        umsMember.setMemberLevelId("4");
        umsMember.setUsername("profiteur");
        umsMember.setPhone("13814381438");
        umsMember.setStatus(1);
        umsMember.setCreateTime(new Date());
        userService.insertUser(umsMember);
    }
}
