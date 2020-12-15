package com.muxin.controller;

import com.muxin.pojo.User;
import com.muxin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl2")
    private UserService userService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<User> findAll(){
        List<User> userList = userService.findAll();
        return userList;
    }

    /**
     * 根据id查询单个
     * @param id
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User findOne(@PathVariable Integer id){
        return userService.finOne(id);
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String add(User user){
        user.setCreateDate(new Date());
        userService.add(user);
        return "添加成功";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public String update(@RequestBody User user,@PathVariable Integer id){
        userService.update(user,id);
        return "success";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        userService.delete(id);
        return "success";
    }
}
