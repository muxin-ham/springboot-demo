package com.muxin.dao;

import com.muxin.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select * from user")
    public List<User> findAll();

    @Select({"select * from user where uid=#{id}"})
    public User finOne(Integer id);

    @Insert("insert into user(username,password,status,description,createDate) values(#{username},#{password},#{status},#{description},#{createDate})")
    void add(User user);

    @Update("update user set username=#{username},password=#{password},status=#{status},description=#{description} where uid=#{uid}")
    void update(User user);

    @Delete("delete from user where uid=#{id}")
    void delete(Integer id);
}
