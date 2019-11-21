package me.helllp.sss.common.utils;

import java.util.Iterator;

import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.PropertySource;

/**
 * 开发中的一些工具
 * 
 * @author 林晓明
 *
 */
public class DebugUtils {
	/**
	 * 打印环境中的所有配置信息
	 * 
	 * @param env
	 */
	public static void displaySetting(Environment env){
		for(Iterator<PropertySource<?>>  it = ((AbstractEnvironment) env).getPropertySources().iterator(); it.hasNext(); ) {
		    PropertySource<?> propertySource = (PropertySource<?>) it.next();
		    //遍历每个配置来源中的配置项
		    if (propertySource instanceof EnumerablePropertySource) {
		        for(String name : ((EnumerablePropertySource<?>)propertySource).getPropertyNames()) {
		            /*
		            由于每个配置来源可能配置了同一个配置项，存在相互覆盖的情况，为了保证获取到的值与通过@Value获取到的值一致，
		            需要通过env.getProperty(name)获取配置项的值。
		            */
		            System.out.println("name:" + name + "; value " + env.getProperty(name));
		        }
		    }
		}		
	}
}
