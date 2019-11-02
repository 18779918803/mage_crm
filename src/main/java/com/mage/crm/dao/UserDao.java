package com.mage.crm.dao;

import com.mage.crm.vo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    User queryUserByName(String userName);

    User queryUserById(String id);

    int updatePwd(@Param("id") String id, @Param("userPwd")String userPwd);
}
