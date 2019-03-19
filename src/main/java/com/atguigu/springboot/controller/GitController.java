package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

    @RequestMapping("git")
    public String gitC(){
        return "Git hello";
    }
}
