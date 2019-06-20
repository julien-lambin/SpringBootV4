package com.kf.demo;

import com.kf.demo.dao.GameDao;
import com.kf.demo.dao.ProductDao;
import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplicationTests.class)
@ComponentScan(basePackages = "com")
@EnableJpaRepositories("com.kf.demo")
public class DemoApplicationTests {


	@Test
	public void contextLoads() {
		Assert.assertTrue(true);
	}

}
