package me.helllp.sss.authentication.rest;

import me.helllp.sss.common.base.BaseController;
import me.helllp.sss.common.base.BaseResult;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController extends BaseController{
	@PostMapping("/logic")
	public BaseResult<String> login(){
		return null;
	}
}
