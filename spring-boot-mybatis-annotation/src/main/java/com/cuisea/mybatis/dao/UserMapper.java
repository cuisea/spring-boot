package com.cuisea.mybatis.dao;

import com.cuisea.mybatis.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author cuisea
 * @date 2017/11/27 下午7:21
 */
//@Mapper
public interface UserMapper {
    @Select("select * from b_user")
    @Results({
            @Result(property = "userName",column = "user_name"),
            @Result(property = "passWord",column = "pass_word"),
            @Result(property = "nickName",column = "nick_name"),
            @Result(property = "regTime",column = "reg_time")
    })//@Result 修饰返回的结果集，关联实体类属性和数据库字段一一对应，如果实体类属性和数据库属性名保持一致，就不需要这个属性来修饰。
    List<User> getAll();

    @Select("select * from b_user where id = #{id}")
    @Results({
            @Result(property = "userName",column = "user_name"),
            @Result(property = "passWord",column = "pass_word"),
            @Result(property = "nickName",column = "nick_name"),
            @Result(property = "regTime",column = "reg_time")
    })
    User getOne(Long id);

    @Insert("insert into b_user(user_name,pass_word,email,nick_name,reg_time) values(#{userName},#{passWord},#{email},#{nickName},#{regTime})")
    void insert(User user);

    @Update("update b_user set user_name=#{userName},pass_word=#{passWord},email=#{email},nick_name=#{nickName},reg_time=#{regTime}")
    void update(User user);

    @Delete("delete from b_user where id=#{id}")
    void delete(Long id);
}
