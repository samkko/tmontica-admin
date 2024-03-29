package com.internship.tmontica_admin.user;

import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface UserDao {

    @Select("SELECT id, name, email, birth_date, password, role, created_date, point, is_active, activate_code FROM users WHERE id = #{id}")
    User getUserByUserId(String id);
    @Update("UPDATE users SET point = #{point} where id = #{id}")
    int updateUserPoint(int point, String id);
    @Select("SELECT point FROM users WHERE id = #{id}")
    int getUserPointByUserId(String id);
}
