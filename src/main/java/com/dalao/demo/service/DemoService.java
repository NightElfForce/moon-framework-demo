package com.dalao.demo.service;
import java.util.*;
public interface DemoService {

    String getName(String name);

    List getUser(String name,String age);

    List getUserLikeName(String name);

    int insertUser(String name,String age);
}
