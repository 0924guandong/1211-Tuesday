package com.gd.spring.cloud.alibaba.blog.search.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Description TODO
 * @Author Mr.Starry
 * @Date 2019/12/13 0013 下午 7:09
 * @Version 1.0
 */

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -66825449L;
    private String username;

}
