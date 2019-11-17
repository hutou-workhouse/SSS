package me.helllp.sss.data.bean;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 角色信息
 * 
 * @author 林晓明
 *
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class RoleBean extends BaseDataBean{
	private static final long serialVersionUID = -4470079494894206106L;

	/**
	 * 角色ID，唯一标识
	 */
	private String roleId;
	
	/**
	 * 角色名称
	 */
	private String name;
	
	/**
	 * 角色说明
	 */
	private String memo;
	
	/**
	 * 角色拥有的权限点列表
	 */
	private List<PolicyBean> policyList;
}
