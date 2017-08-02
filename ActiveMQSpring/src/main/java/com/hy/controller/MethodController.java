package com.hy.controller;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
    	ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");  
        //获取容器的一个实例  
    	BuildCompile buildCompile = (BuildCompile) ac.getBean("buildCompileBean");  
        System.out.println("memcache address: " + buildCompile.getMemAddr());  
    	System.out.println("zookeeper address: " + buildCompile.getZooAddr());
    	buildCompile.printMemAddr();
    	User user = userService.getUserById((long) 1);
		return user;
    }  
}  