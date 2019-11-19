package me.helllp.sss.authentication.rest;

import me.helllp.sss.common.base.BaseController;
import me.helllp.sss.common.base.BaseResult;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 认证接口
 * 
 * @author 林晓明
 *
 */
@RestController
@RequestMapping("/authentication")
public class AuthenticationController extends BaseController{
	@PostMapping("/logic")
	public BaseResult<String> login(){
		return null;
	}
	
	public void logout(){
		
	}
	
	public void userInfo(){
		
	}
	
	public void userLoginInfo(){
		
	}
}
