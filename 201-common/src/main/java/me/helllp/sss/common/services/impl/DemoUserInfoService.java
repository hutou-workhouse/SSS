package me.helllp.sss.common.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import me.helllp.sss.common.services.UserInfoService;
import me.helllp.sss.data.bean.UserInfoBean;
import me.helllp.sss.data.service.RoleDataService;

public class DemoUserInfoService implements UserInfoService{
	@Autowired
	private RoleDataService demo;
	
	@Override
	public UserInfoBean getUserInfo() {
		UserInfoBean bean = new UserInfoBean();
		bean.setAccount("linxm11");
		demo.deleteRole("22");
		return bean;
	}

	@Override
	public void initService(Environment e) {
	}

}
