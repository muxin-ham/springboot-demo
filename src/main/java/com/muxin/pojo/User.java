package com.muxin.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;
import java.util.Date;

@Data//无参数构造函数
@NoArgsConstructor//无参数构造函数
@AllArgsConstructor//所有参数的有参数构造函数
@ConfigurationProperties(prefix = "user")
public class User implements Serializable {
    private Integer uid;
    private String username;
    private String password;
    private Integer status;
    private String description;

    //@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createDate;
}
