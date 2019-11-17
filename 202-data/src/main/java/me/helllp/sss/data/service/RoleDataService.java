package me.helllp.sss.data.service;

import java.util.List;

import me.helllp.sss.data.bean.RoleBean;
import me.helllp.sss.data.bean.UserInfoBean;

/**
 * 角色信息管理接口
 * 
 * @author 林晓明
 *
 */
public interface RoleDataService {
	/**
	 * 基于用户信息获取角色信息列表
	 * 
	 * @param userId	用户ID
	 * @return
	 */
	public List<RoleBean> getRoleByUserId(String userId);
	
	/**
	 * 创建角色，返回角色ID
	 * 
	 * @param bean		角色信息
	 * @return
	 */
	public String createRole(RoleBean bean);
	
	/**
	 * 基于角色ID，删除角色信息
	 * 
	 * @param id		角色ID
	 * @return
	 */
	public boolean deleteRole(String id);
	
	/**
	 * 更新角色本身的信息
	 * 
	 * @param bean		角色信息
	 * @return
	 */
	public boolean updateRole(RoleBean bean);
	
	/**
	 * 基于角色信息，查询拥有此角色的用户列表
	 * 
	 * @param roleId
	 * @return
	 */
	public UserInfoBean searchUserListByRole(String roleId);
}
