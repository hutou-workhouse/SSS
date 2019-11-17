package me.helllp.sss.authentication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger的配置类，支持发布环境下关闭
 * 
 * @author 林晓明
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Value("${swagger.enable:false}")
	private boolean showSwagger;
	
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
				.enable(showSwagger)
				.select()
				.apis(RequestHandlerSelectors.basePackage("me.helllp.sss"))
				.paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("SSS认证鉴权服务")
				.description("提供互联网认证鉴权的通用能力")
				.termsOfServiceUrl("www.helllp.me")
				.version("0.0.1").build();
	}
}
