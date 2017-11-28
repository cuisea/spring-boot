package com.cuisea.redis;

import com.cuisea.redis.dao.UserRepository;
import com.cuisea.redis.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 用户测试
 *
 * @author cuisea
 * @date 2017/11/24 下午7:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testAddUser(){
        User user=new User("海洋","123456","cuisea@163.com","\uD83D\uDE0A","2017-11-24");//😊
        user=userRepository.save(user);
    }
}
