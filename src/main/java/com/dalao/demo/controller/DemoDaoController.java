package com.dalao.demo.controller;

import com.dalao.demo.service.DemoService;
import com.hero.spa.core.ioc.annotation.SPA;
import com.hero.spa.mvc.annotation.Controller;
import com.hero.spa.mvc.annotation.GET;

import java.util.*;


/**
 * 演示mvc结合ioc功能
 */
@Controller("/dao/")
public class DemoDaoController {


    /**
     * 等同于spring的 @Autowired,让大佬们注入多个SPA对象，好好享受
     */
    @SPA
    private DemoService demoService;

    /**
     * 读取数据库返回信息
     * http://localhost:3333/dao/getUser?name=大佬&age=18
     */
    @GET("getUser")
    public List getUser(String name,String age) {
        List list =  demoService.getUser(name,age);
        return list;
    }

    /**
     * 读取数据库返回信息 like匹配
     * http://localhost:3333/dao/getUserLikeName?name=二
     */
    @GET("getUserLikeName")
    public List getUserLikeName(String name) {
        List list =  demoService.getUserLikeName(name);
        return list;
    }


    /**
     * 读取数据库返回信息 like匹配
     * http://localhost:3333/dao/insertUser?name=haha&age=20
     */
    @GET("insertUser")
    public int insertUser(String name,String age) {
        int list =  demoService.insertUser(name,age);
        return list;
    }



}
