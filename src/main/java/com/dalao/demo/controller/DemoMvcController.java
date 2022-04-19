package com.dalao.demo.controller;

import com.hero.spa.mvc.annotation.Controller;
import com.hero.spa.mvc.annotation.GET;
import com.hero.spa.mvc.annotation.POST;
import com.hero.spa.mvc.annotation.RequestBody;
import java.util.*;


/**
 * 演示mvc功能
 */
@Controller("/spa/")
public class DemoMvcController {

    /**
     * 最简单的请求返回参数
     * http://localhost:3333/spa/getHaha
     */
    @GET("getHaha")
    public String getHaha(){
        return "简单的请求";
    }

    /**
     * 获取参数
     */
    @GET("getByParam")
    public String getByParam(String name,String age){
        return "大佬--"+name+"--发起了请求，他的年纪是"+age;
    }

    /**
     * Post请求获取Body中参数
     */
    @POST("getBody")
    public String getBody(@RequestBody Map body,String name){
        return "获取到了body信息"+body.toString()+"url参数name"+name;
    }


}
