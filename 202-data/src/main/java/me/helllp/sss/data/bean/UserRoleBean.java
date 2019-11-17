package me.helllp.sss.data.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户信息结构
 * 
 * @author 林晓明
 *
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class UserRoleBean extends BaseDataBean{
	private static final long serialVersionUID = -8848955551886059914L;

	/**
	 * 账号，全系统唯一，唯一标识用户身份
	 */
	private String account;
	
	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 认证凭证
	 */
	private String accesToken;
	
	/**
	 * 邮箱
	 */
	private String mail;
	
	/**
	 * 电话
	 */
	private String phone;
	
	/**
	 * 年龄
	 */
	private Integer age;
}
