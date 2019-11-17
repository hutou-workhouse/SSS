package me.helllp.sss.data.bean;

import java.util.List;

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
public class MenuBean extends BaseDataBean{
	private static final long serialVersionUID = -4470079494894206106L;

	/**
	 * 菜单ID，唯一标识
	 */
	private String menuId;
	
	/**
	 * 菜单名称
	 */
	private String menuName;
	
	/**
	 * 菜单说明
	 */
	private String memo;
	
	/**
	 * 父菜单，根节点父菜单为NULL
	 */
	private MenuBean parent;
	
	/**
	 * 子菜单列表，叶子菜单此项为NULL
	 */
	private List<MenuBean> childList;
}
