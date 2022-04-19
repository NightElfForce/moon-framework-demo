package com.dalao.demo.controller;

import com.dalao.demo.service.DemoService;
import com.dalao.demo.service.SpaService;
import com.hero.spa.core.ioc.annotation.SPA;
import com.hero.spa.mvc.annotation.Controller;
import com.hero.spa.mvc.annotation.GET;
import com.hero.spa.mvc.annotation.POST;
import com.hero.spa.mvc.annotation.RequestBody;

import java.util.Map;


/**
 * 演示mvc结合ioc功能
 */
@Controller("/ioc/")
public class DemoIocController {


    /**
     * 等同于spring的 @Autowired,让大佬们注入多个SPA对象，好好享受
     */
    @SPA
    private DemoService demoService;

    @SPA
    private SpaService spaService;



    /**
     * 通过注入的接口返回结果
     * http://localhost:3333/ioc/getName?name=大佬
     */
    @GET("getName")
    public String getName(String name){
        return demoService.getName(name);
    }



    /**
     * 通过注入的接口返回结果
     * http://localhost:3333/ioc/getSpaAddress
     *
     *  {
     *         "name": "dalao",
     *         "age":"18"
     *   }
     */

    @POST("getSpaAddress")
    public String getSpaAddress(@RequestBody Map message){
        return spaService.getSpaAddress(message.get("age").toString(),message.get("name").toString());
    }



}
