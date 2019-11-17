package me.helllp.sss.common.base;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 分页输入对象基类
 * 
 * @author 林晓明
 *
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class PageParams extends BaseParams{
	/**
	 * 当前页码
	 */
	private Integer pages;
	
	/**
	 * 每页显示条数
	 */
	private Integer size;
}
