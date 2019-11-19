package me.helllp.sss.common.base;

import org.springframework.beans.factory.annotation.Autowired;

import me.helllp.sss.common.services.UserInfoService;
import me.helllp.sss.data.bean.UserInfoBean;

/**
 * 控制器基类
 * 
 * @author 林晓明
 *
 */
public class BaseController {
	@Autowired
	private UserInfoService userInfoService;
	
	public UserInfoBean getUserInfo(){
		return userInfoService.getUserInfo();
	}
}
