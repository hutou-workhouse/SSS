package me.helllp.sss.data.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 资源信息
 * 
 * @author 林晓明
 *
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class ResourceBean extends BaseDataBean{
	private static final long serialVersionUID = -4470079494894206106L;

	/**
	 * 资源的唯一标识
	 */
	private String resId;
	
	/**
	 * 资源的RUI
	 */
	private String resURI;
	
	/**
	 * 资源的访问方式
	 */
	private String method;
	
	/**
	 * 资源的描述
	 */
	private String resMemo;
}
