package com.tyrant.gmall.user.mapper;

import com.tyrant.gmall.bean.UmsMember;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author:profiteur
 * @create 2020-04-15 21:28
 * @description
 **/
@Repository
public interface UserMapper  extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();

    UmsMember selectUserById(int id);
}
