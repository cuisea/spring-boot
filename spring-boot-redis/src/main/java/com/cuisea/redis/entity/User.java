package com.cuisea.redis.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户
 *
 * @author cuisea
 * @date 2017/11/21 上午10:38
 */
@Entity
@Table(name = "b_user")
public class User implements Serializable{

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false,unique = false)
    private String userName;
    @Column(nullable = false,unique = false)
    private String passWord;
    @Column(nullable = true,unique = false)
    private String email;
    @Column(nullable = true,unique = false)
    private String nickName;
    @Column(nullable = true)
    private String regTime;


    public User(){
        System.out.println("User constructor execute");
    }

    public User(String userName, String passWord, String email, String nickName, String regTime) {
        this.userName = userName;
        this.passWord = passWord;
        this.email = email;
        this.nickName = nickName;
        this.regTime = regTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRegTime() {
        return regTime;
    }

    public void setRegTime(String regTime) {
        this.regTime = regTime;
    }

}

