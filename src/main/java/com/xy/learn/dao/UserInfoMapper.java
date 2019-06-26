package com.xy.learn.dao;


import com.xy.learn.entity.UserInfoEntity;

public interface UserInfoMapper {
	// 
	
	/**
	 * 插入user
	 * @param userInfo
	 * @return
	 */
	UserInfoEntity insert(UserInfoEntity userInfo);
	
	int delete(String userId);
	// int delete(Integer id);
	
	/**
	 * 根据userId获取用户信息
	 * @param userId
	 * @return
	 */
	UserInfoEntity findByUserId(String userId);
}
