package com.ljy.springboot.web.action;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {


	/*
	 * 跳转到hello页面
	 */
	@RequestMapping(value = "/hello")
	public String hello(){
		return "/hello";
	}

}
