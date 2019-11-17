package me.helllp.sss.common.services;

import me.helllp.sss.data.bean.UserInfoBean;

/**
 * 认证的主体逻辑
 * 
 * @author 林晓明
 *
 */
public interface AuthenticationService extends InitializeService{
	/**
	 * 用户登录
	 * 
	 * @param tenantId		租户ID
	 * @param userId
	 * @param password
	 * @return
	 */
	public UserInfoBean login(String tenantId, String userId, String password);
	
	/**
	 * 用户登出
	 * 
	 * @return
	 */
	public boolean logout();
}
