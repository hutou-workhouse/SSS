package me.helllp.sss.common.services.impl;

import org.springframework.core.env.Environment;

import me.helllp.sss.common.services.AuthenticationService;
import me.helllp.sss.data.bean.UserInfoBean;

/**
 * 默认的认证接口实现
 * 
 * @author 林晓明
 *
 */
public class DefaultAuthenticationService implements AuthenticationService{

	@Override
	public void initService(Environment e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserInfoBean login(String tenantId, String userId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}

}
