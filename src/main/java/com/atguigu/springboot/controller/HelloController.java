package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String Hello(){
        return "hello world";
    }

    // classpath:/templates/success.html
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("name","<h1>TOM</h1>");
        map.put("uname","<h1>TOM</h1>");
        map.put("age",23);
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }
}
