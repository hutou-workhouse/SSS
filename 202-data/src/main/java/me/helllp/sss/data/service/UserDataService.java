package me.helllp.sss.data.service;

import me.helllp.sss.data.bean.UserInfoBean;
import me.helllp.sss.data.bean.UserRoleBean;

/**
 * 用户信息管理接口
 * 
 * @author 林晓明
 *
 */
public interface UserDataService {
	
	/**
	 * 基于用户ID，获取用户信息。
	 * 
	 * @param userId	用户ID
	 * @return
	 */
	public UserInfoBean getUserInfo(String userId);
	
	/**
	 * 基于用户ID，获取用户权限信息
	 * 
	 * @param userId
	 * @return
	 */
	public UserRoleBean getUserRoleInfo(String userId);
	
	/**
	 * 创建用户，返回用户创建成功的ID
	 * 
	 * @param bean
	 * @return
	 */
	public String createUser(UserInfoBean bean);
	
	/**
	 * 基于用户ID，删除用户
	 * 
	 * @param id
	 * @return
	 */
	public boolean deleteUser(String id);
	
	/**
	 * 更新用户，对象中不为空的内容是要更新的
	 * 
	 * @param bean
	 * @return
	 */
	public boolean updateUser(UserInfoBean bean);
}
