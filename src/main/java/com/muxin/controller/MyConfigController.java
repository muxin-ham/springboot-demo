package com.muxin.controller;

import com.muxin.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oneself")
@EnableConfigurationProperties({User.class})
public class MyConfigController {

    @Autowired
    private User user;

    @RequestMapping(value = "/getConfig",method = RequestMethod.GET)
    public User getConfig(){
        return user;
    }
}
