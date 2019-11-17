package me.helllp.sss.data.bean;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户权限信息结构
 * 
 * @author 林晓明
 *
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class UserInfoBean extends BaseDataBean{
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
	 * 角色信息列表
	 */
	private List<RoleBean> roleList;
}
