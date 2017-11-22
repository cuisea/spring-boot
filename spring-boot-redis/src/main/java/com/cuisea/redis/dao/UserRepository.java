package com.cuisea.redis.dao;

import com.cuisea.redis.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by cuisea on 2017/5/2.
 */
public interface UserRepository extends JpaRepository<User,Long>{
    User findByUserName(String userName);
    User findByUserNameOrEmail(String userName, String email);
}
