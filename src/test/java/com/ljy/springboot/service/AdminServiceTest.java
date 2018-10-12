package com.ljy.springboot.service;

import com.ljy.springboot.SpringbootApplicationTests;
import com.ljy.springboot.model.Admin;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import javax.annotation.Resource;

public class AdminServiceTest extends SpringbootApplicationTests {
    @Resource
    private AdminService adminService;

    @Test
    public void loginTest(){
        System.out.println(adminService.login("user","123456"));
        System.out.println(adminService.login("user","123"));
    }

    @Test
    public void getAdminsTest(){
        System.out.println("账户总数："+adminService.getAdmins().size());
    }


    @Test
    public void addAdminTest(){
        Admin admin=new Admin();
        admin.setUsername("admin1");
        admin.setName("管理1");
        adminService.addAdmin(admin);
    }
}
