package com.ljy.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional//表示注释的类或方法整个为一个事务
@Rollback(false)//表示事务执行完回滚，支持传入一个参数value，默认true即回滚，false不回滚。
public class SpringbootApplicationTests {

	@Test
	public void contextLoads() {
	}

}
