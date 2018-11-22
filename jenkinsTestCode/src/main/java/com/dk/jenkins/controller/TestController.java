package com.dk.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kaize
 * @Date: 2018/11/22 22:21
 */
@RestController
@RequestMapping("test")
public class TestController {

	@RequestMapping("hello")
	public String sayHello(){
		return "hello word !";
	}
}
