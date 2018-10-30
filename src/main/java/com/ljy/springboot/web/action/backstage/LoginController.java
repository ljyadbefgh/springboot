package com.ljy.springboot.web.action.backstage;



import com.ljy.springboot.model.Admin;
import com.ljy.springboot.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/backstage")
public class LoginController {

	@Resource
	private AdminService adminService;

	/*
	 * 跳转到登录页面
	 */
	@RequestMapping(value = "/toLogin")
	public String toLogin(){
		return "/backstage/login.html";
	}


	/*
	 * 后台登录处理
	 */
	@ResponseBody
	@RequestMapping(value = "/login")
	public Map<String, Object> login(String username, String password, HttpSession session){
		Map<String, Object> map=new HashMap<String, Object>();
		adminService.getAdmins();
		Admin admin=adminService.login(username, password);
		if(admin!=null){
			session.setAttribute("admin",admin);
			map.put("status", 1);
		}else{
			map.put("status", -1);
			map.put("myMessage", "登录失败：用户名和密码错误");
		}
		return map;
	}

	/**
     * 注销
	 * @return
     */
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session){
		session.removeAttribute("admin");
		return "/backstage/login.html";
	}


	/**
	 * 跳转到后台首页
	 * @return
	 */
	@RequestMapping(value = "/index")
	public String index(){
		return "/backstage/index.html";
	}

	/**
	 * 跳转到后台首页主要内容
	 * @return
			 */
	@RequestMapping(value = "/main")
	public String main(){
		return "/backstage/main.html";
	}


}
