package com.learn.test.seviceTest;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xy.learn.entity.UserInfoEntity;
import com.xy.learn.service.UserInfoService;
import com.xy.learn.service.impl.UserInfoServiceImpl;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/spring-context.xml"})
public class DbTest {
	@Resource
	private UserInfoService userInfoService;
	
	@Test
	public void test() {
		// 查找用户
//		UserInfoEntity userInfo = userInfoService.queryUserInfo("102323");
//		if(userInfo != null) {
//			System.err.println(userInfo.getNickName());
//		} else {
//			System.err.println("null...");
//		}
		// 测试注册用户
//		UserInfoEntity userInfo = userInfoService.regerit("abc", "123", "123", "1", "1");
		// 登录测试
		userInfoService.loginByUserId("672507", "123");
	}
	
}
