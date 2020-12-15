package com.muxin.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将所有D:\\springboot\\pic\\ 访问都映射到/myPic/** 路径下
        //registry.addResourceHandler("/myPic/**").addResourceLocations("file:D:\\springboot\\pic\\");

    }
}
