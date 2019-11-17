package me.helllp.sss.data.bean;

import java.util.List;
import java.util.Set;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 权限点信息
 * 
 * @author 林晓明
 *
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class PolicyBean extends BaseDataBean{
	private static final long serialVersionUID = -4470079494894206106L;

	/**
	 * 权限点ID
	 */
	private String policyId;
	
	/**
	 * 权限点名称
	 */
	private String name;
	
	/**
	 * 权限点说明
	 */
	private String memo;
	
	/**
	 * 菜单ID集合
	 */
	private Set<String> menuIds;
	
	/**
	 * 资源列表
	 */
	private List<ResourceBean> resList;
}
