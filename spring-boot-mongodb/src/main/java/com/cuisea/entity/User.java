package com.cuisea.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户
 *
 * @author cuisea
 * @date 2017/11/27 下午7:08
 */
@Data
public class User implements Serializable{

    private Long id;
    private String userName;
    private String passWord;
    private String email;
    private String nickName;
    private String regTime;

}
