package com.cuisea.mybatis.dao;

import com.cuisea.mybatis.entity.User;

import java.util.List;

/**
 * @author cuisea
 * @date 2017/11/27 下午7:21
 */
//@Mapper
public interface UserMapper {
    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}
