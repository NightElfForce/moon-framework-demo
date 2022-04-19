package com.dalao.demo.mapper;

import com.hero.spa.orm.annotation.Insert;
import com.hero.spa.orm.annotation.Mapper;
import com.hero.spa.orm.annotation.Select;

import java.util.*;

/**
 * 所有添加@Mapper的注解都会注册
 */
@Mapper
public interface UserMapper {

    @Select("select * from tb_user where age=#{age} and name =#{name}")
    List getUser(String name, String age);


    @Select("select * from tb_user where name like #{%name%}")
    List getUsers(String name);


    @Select("select * from tb_user where name like #{%name}")
    List getUserByName(String name);


    @Insert("insert into tb_user values (#{name},#{age})")
    int insertUser(String name,String age);


}
