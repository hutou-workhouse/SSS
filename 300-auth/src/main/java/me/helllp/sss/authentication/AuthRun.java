package me.helllp.sss.authentication;

import lombok.extern.log4j.Log4j2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 启动认证鉴权服务
 * 
 * @author 林晓明
 *
 */
@SpringBootApplication
@Log4j2
public class AuthRun {

	public static void main(String[] args) {
		ConfigurableApplicationContext config = SpringApplication.run(AuthRun.class, args);
		log.info("=======started========",config.getApplicationName());
		
	}

}
