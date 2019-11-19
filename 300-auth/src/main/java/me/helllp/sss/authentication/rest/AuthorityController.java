package me.helllp.sss.authentication.rest;

import me.helllp.sss.common.base.BaseController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 鉴权接口
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/authority")
public class AuthorityController extends BaseController{
	@PostMapping("/roleinfo")
	public void getRoleInfo(){
		
	}
	
	@PostMapping("/judgement")
	public void hasPolicy(){
	}
}
