package me.helllp.sss.common.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * Servlet相关工具类
 * 
 * @author 林晓明
 *
 */
public class ServletUtils {
	/**
	 * 获取Request对象
	 * 
	 * @return
	 */
	public static HttpServletRequest getRequest(){
	    return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
	}
	
	/**
	 * 获取Response对象
	 * 
	 * @return
	 */
	public static HttpServletResponse getResponse(){
	    return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getResponse();
	}
	
	
}
