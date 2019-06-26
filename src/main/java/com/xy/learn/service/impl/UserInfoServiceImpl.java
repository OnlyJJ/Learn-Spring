package com.xy.learn.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xy.learn.common.utils.UserIdUtil;
import com.xy.learn.dao.UserInfoMapper;
import com.xy.learn.entity.UserInfoEntity;
import com.xy.learn.service.UserInfoService;

@Service()
public class UserInfoServiceImpl implements UserInfoService {
	
	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public UserInfoEntity regerit(String nickName, String password, String mobile, String mail, String sex) {
		// TODO Auto-generated method stub
		UserInfoEntity userInfo = new UserInfoEntity();
		userInfo.setNickName(nickName);
		userInfo.setPassword(password);
		userInfo.setMobile(mobile);
		userInfo.setMail(mail);
		userInfo.setSex(sex);
		
		// 设置userId
		String userId = UserIdUtil.genUserId();
		userInfo.setUserId(userId);
		
		// 写入数据库
		
		return userInfoMapper.insert(userInfo);
	}

	@Override
	public UserInfoEntity loginByUserId(String userId, String password) {
		// TODO Auto-generated method stub
		UserInfoService userInfoService = new UserInfoServiceImpl();
		UserInfoEntity userinfo = userInfoService.queryUserInfo(userId);
		if (userId == userinfo.getUserId() || password == userinfo.getPassword()) {
			System.err.println("登录成功");
		} else {
			System.err.println("登录失败");
		}
		return null;
	}

	@Override
	public UserInfoEntity loginByMobile(String mobile, String password, String code, int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfoEntity loginByMail(String mail, String password, String code, String type) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public UserInfoEntity queryUserInfo(String userId) {
		return userInfoMapper.findByUserId(userId);
	}

}
