package com.muxin.service.impl;

import com.muxin.pojo.User;
import com.muxin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 原生JDBCTemplate
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    //springBoot 提供的数据库操作类
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> findAll() {
        return jdbcTemplate.query("select * from user",new BeanPropertyRowMapper<>(User.class));
    }

    @Override
    public User finOne(Integer id) {
        return jdbcTemplate.queryForObject("select * from user where uid=?",new BeanPropertyRowMapper<>(User.class),id);
    }

    @Override
    public void add(User user) {
        jdbcTemplate.update("insert into user(username,password,status,description,createDate) values(?,?,?,?,?)",user.getUsername(),user.getPassword(),user.getStatus(),user.getDescription(),user.getCreateDate());
    }

    @Override
    public void update(User user, Integer id) {
        jdbcTemplate.update("update user set username=?,password=?,status=?,description=? where uid=?",user.getUsername(),user.getPassword(),user.getStatus(),user.getDescription(),id);
    }

    @Override
    public void delete(Integer id) {
        jdbcTemplate.update("delete from user where uid = ?",id);
    }


}
