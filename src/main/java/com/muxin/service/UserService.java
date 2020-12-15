package com.muxin.service;

import com.muxin.pojo.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();

    public User finOne(Integer id);

    void add(User user);

    void update(User user, Integer id);

    void delete(Integer id);
}
