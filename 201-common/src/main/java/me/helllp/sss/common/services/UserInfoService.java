package me.helllp.sss.common.services;

import me.helllp.sss.data.bean.UserInfoBean;

/**
 * 用户信息获取接口
 * 
 * @author 林晓明
 *
 */
public interface UserInfoService extends InitializeService{
	/**
	 * 获取用户信息
	 * 
	 * @return
	 */
	public UserInfoBean getUserInfo();
	
	/**
	 * 根据账号获取用户的登录token
	 * 
	 * @param account
	 * @return
	 */
	public String getUserToken(String account);
}
