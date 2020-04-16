package com.tyrant.gmall.user.mapper;

import com.tyrant.gmall.user.bean.UmsMember;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author:profiteur
 * @create 2020-04-15 21:28
 * @description
 **/
@Repository
public interface UserMapper {
    List<UmsMember> selectAllUser();
}
