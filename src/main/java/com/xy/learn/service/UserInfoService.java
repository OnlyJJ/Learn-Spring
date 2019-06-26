package com.xy.learn.service;

import com.xy.learn.entity.UserInfoEntity;

/**
 * 用户服务
 * @author X
 *
 */
public interface UserInfoService {
	
	/**
	 * 注册
	 * @return
	 */
	UserInfoEntity regerit(String nickName, String password, String mobile, String mail, String sex);
	
	/**
	 * 用户id登录
	 * @return
	 */
	UserInfoEntity loginByUserId(String userId, String password);
	
	/**
	 * 手机号登录（密码或验证码）
	 * @param code 验证码
	 * @param type 0-密码登录，1-验证码登录
	 * @return
	 */
	UserInfoEntity loginByMobile(String mobile, String password, String code, int type);
	
	/**
	 * 邮箱登录
	 * @param code 验证码
	 * @param type 0-密码登录，1-验证码登录
	 * @return
	 */
	UserInfoEntity loginByMail(String mail, String password, String code, String type);
	
	/**
	 * 获取用户信息
	 * @param userId 用户id，唯一
	 * @return
	 */
	UserInfoEntity queryUserInfo(String userId);
}
