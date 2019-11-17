package me.helllp.sss.common.services.impl;

import org.springframework.core.env.Environment;

import me.helllp.sss.common.services.UserInfoService;
import me.helllp.sss.data.bean.UserInfoBean;

public class DefaultUserInfoService implements UserInfoService{

	@Override
	public UserInfoBean getUserInfo() {
		UserInfoBean bean = new UserInfoBean();
		bean.setAccount("linxm");
		return bean;
	}

	@Override
	public void initService(Environment e) {
	}

}
