package com.shawn.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shawn.test.domain.NeoProperties;
import com.shawn.test.domain.User;

@RestController
public class HelloWorldController {
	
	
	@Autowired  
	NeoProperties neoProperties;  
	
    @RequestMapping("/hello")
    public String index() {
        return "Hello World2";
    }
    
    @RequestMapping("/getUser")
    public User getUser() {
    	User user=new User();
    	user.setUserName("小明");
    	user.setPassWord("xxxx");
        return user;
    }
    
    @RequestMapping("/getProperties")
    public NeoProperties getProperties() {
        return neoProperties;
    }
    
}