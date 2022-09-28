package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.User;
import com.jiawa.wiki.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private UserService userService;
    /**
     * GET,POST,PUT,DELETE
     * @return
     */
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){

        return "Hello World post" + name ;

    }

    @RequestMapping("/test/queryList")
    public List<User> queryList(){

        return userService.queryUserList();
    }


}
