package com.huayu.git.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zhao
 * @Date 2019/3/14 16:28
 * @Description:
 **/
@Controller
@RequestMapping(value = "/test")
public class Test {

    @RequestMapping(value = "/show.do")
    public void show(String userName){
        System.out.println("_-----"+userName);
    }
}
