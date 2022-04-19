package com.dalao.demo.service.impl;

import com.dalao.demo.service.SpaService;
import com.hero.spa.core.ioc.annotation.Bean;

@Bean
public class SpaServiceImpl implements SpaService{
    @Override
    public String getSpaAddress(String age, String name) {
        return "大佬--"+name+"--今年"+age+"岁，适合去厂里打螺丝！";
    }
}
