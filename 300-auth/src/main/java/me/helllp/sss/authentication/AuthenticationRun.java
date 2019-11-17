package me.helllp.sss.authentication;

import me.helllp.sss.common.services.UserInfoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 启动认证服务
 * 
 * @author 林晓明
 *
 */
@SpringBootApplication
public class AuthenticationRun {

	public static void main(String[] args) {
		ConfigurableApplicationContext config = SpringApplication.run(AuthenticationRun.class, args);
		
		UserInfoService bean = config.getBean(UserInfoService.class);
		bean.getUserInfo();
		System.out.println(bean);
	}

}
