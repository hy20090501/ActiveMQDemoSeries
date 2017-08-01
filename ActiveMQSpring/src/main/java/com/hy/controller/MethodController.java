package com.hy.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hy.domain.User;
import com.hy.service.UserService;
import com.hy.test.build.BuildCompile;

@Controller  
@RequestMapping("/user")
public class MethodController {  

    @Resource  
    private UserService userService;  

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)  
    @ResponseBody  
    public User findUserById(@PathVariable("name") String name) {  
    	BuildCompile temp = new BuildCompile();
//    	System.out.println("memcache address: " + temp.getMemAddr());
    	System.out.println("zookeeper address: " + BuildCompile.zooAddr);
    	User user = userService.getUserById((long) 1);
		return user;
    }  
}  