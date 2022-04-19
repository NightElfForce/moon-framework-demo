package com.dalao.demo.service.impl;

import com.dalao.demo.mapper.UserMapper;
import com.dalao.demo.service.DemoService;
import com.hero.spa.core.ioc.annotation.Bean;
import com.hero.spa.core.ioc.annotation.SPA;

import java.util.*;

/**
 * 所有添加@Bean的注解都会注册
 */
@Bean
public class DemoServiceImpl implements DemoService {

    @SPA
    private UserMapper mapper;

    @Override
    public String getName(String name) {
        return "已经调用 DemoService 的 实现类 返回参数--"+name;
    }

    @Override
    public List getUser(String name,String age) {
        return mapper.getUser(name,age);
    }

    @Override
    public List getUserLikeName(String name) {
        return mapper.getUsers(name);
    }

    @Override
    public int insertUser(String name,String age) {
        return mapper.insertUser(name,age);
    }


}
