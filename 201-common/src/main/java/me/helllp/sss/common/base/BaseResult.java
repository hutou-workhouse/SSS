package me.helllp.sss.common.base;

import lombok.Data;

/**
 * 返回结构对象基类
 * 
 * @author 林晓明
 *
 */
@Data
public class BaseResult<T> {
	/**
	 * 返回结构的错误码
	 */
	private String code;
	
	/**
	 * 返回结构的信息
	 */
	private String msg;
	
	/**
	 * 返回结构的数据
	 */
	private T data;
}
