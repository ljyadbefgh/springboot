package com.ljy.springboot.web.action;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


	/*
	 * @RequestMapping(value = "/")表示默认首页
	 */
	@RequestMapping(value = "/")
	public String index(){
		return "/index";
	}

}
