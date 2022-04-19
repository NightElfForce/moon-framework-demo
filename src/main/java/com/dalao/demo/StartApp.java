package com.dalao.demo;


import com.hero.spa.SpaApplication;
import com.hero.spa.core.ioc.annotation.SPABoot;

@SPABoot
public class StartApp {

    public static void main(String[] args) throws Exception{
        SpaApplication.run(StartApp.class, 3333);
    }
}
