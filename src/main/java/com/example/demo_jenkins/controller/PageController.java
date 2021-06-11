package com.example.demo_jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : WZY
 * @Description : TODO
 * @Date : 2021/6/11 10:43
 * @Version : V1.0
 */
@Controller
public class PageController {

    @GetMapping("favicon.ico")
    @ResponseBody
    void noFaviconIco() {
        //处理没有favicon.ico的问题
    }

    @RequestMapping("/{page}")
    public String toPage(@PathVariable("page") String path){
        return path;
    }
}
