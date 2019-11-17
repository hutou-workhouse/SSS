package me.helllp.sss.common;

import me.helllp.sss.common.services.AuthenticationService;
import me.helllp.sss.common.services.AuthorityService;
import me.helllp.sss.common.services.UserInfoService;
import me.helllp.sss.data.service.RoleDataService;
import me.helllp.sss.data.service.TenantDataService;
import me.helllp.sss.data.service.UserDataService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;

/**
 * 基础包的初始化，依赖spring boot
 * 
 * @author 林晓明
 *
 */
@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
@PropertySource("common.properties")
public class CommonAutoConfig implements EnvironmentAware{

	private Environment env;
	
	@Override
	public void setEnvironment(Environment env) {
		this.env = env;
	}
	
	@Value(value = "${sss.service.userinfo}")
	private String userInfoClass;

	@Value(value = "${sss.service.authentication}")
	private String authenticationClass;
	
	@Value(value = "${sss.service.authority}")
	private String authorityClass;
	
	@Value(value = "${sss.data.tenantservice}")
	private String dataTenantClass;
	
	@Value(value = "${sss.data.userservice}")
	private String dataUserClass;
	
	@Value(value = "${sss.data.roleservice}")
	private String dataRoleClass;
	
	/**
	 * 构造初始化：me.helllp.sss.common.services.UserInfoService实现类
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@Bean
	public AuthenticationService initAuthenticationService() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		//	创建用户服务对象
		Class<?> t = Class.forName(authenticationClass);
		//	类型转换
		AuthenticationService o = (AuthenticationService)t.newInstance();
		//	执行初始化方法
		o.initService(env);
		
		return o;
	}
	
	/**
	 * 构造初始化：me.helllp.sss.common.services.AuthenticationService实现类
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@Bean
	public UserInfoService initUserInfoService() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		//	创建用户服务对象
		Class<?> t = Class.forName(userInfoClass);
		//	类型转换
		UserInfoService o = (UserInfoService)t.newInstance();
		//	执行初始化方法
		o.initService(env);
		
		return o;
	}
	
	/**
	 * 构造初始化：me.helllp.sss.common.services.AuthorityService实现类
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@Bean
	public AuthorityService initAuthorityService() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		//	创建用户服务对象
		Class<?> t = Class.forName(authorityClass);
		//	类型转换
		AuthorityService o = (AuthorityService)t.newInstance();
		//	执行初始化方法
		o.initService(env);
		
		return o;
	}
	
	/**
	 * 构造初始化：me.helllp.sss.data.service.TenantDataService实现类
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@Bean
	public TenantDataService initTenantDataService() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		//	创建用户服务对象
		Class<?> t = Class.forName(dataTenantClass);
		//	类型转换
		TenantDataService o = (TenantDataService)t.newInstance();
		
		return o;
	}
	
	/**
	 * 构造初始化：me.helllp.sss.data.service.UserDataService实现类
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@Bean
	public UserDataService initUserDataService() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		//	创建用户服务对象
		Class<?> t = Class.forName(dataUserClass);
		//	类型转换
		UserDataService o = (UserDataService)t.newInstance();
		
		return o;
	}
	
	/**
	 * 构造初始化：me.helllp.sss.data.service.RoleDataService实现类
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@Bean
	public RoleDataService initRoleDataService() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		//	创建用户服务对象
		Class<?> t = Class.forName(dataRoleClass);
		//	类型转换
		RoleDataService o = (RoleDataService)t.newInstance();
		
		return o;
	}
}
