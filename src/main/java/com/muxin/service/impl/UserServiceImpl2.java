package com.muxin.service.impl;

import com.muxin.dao.UserDao;
import com.muxin.pojo.User;
import com.muxin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * spring结合mybatis
 */
@Service("userServiceImpl2")
public class UserServiceImpl2 implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User finOne(Integer id) {
        return userDao.finOne(id);
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public void update(User user, Integer id) {
        user.setUid(id);
        userDao.update(user);
    }

    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }
}
