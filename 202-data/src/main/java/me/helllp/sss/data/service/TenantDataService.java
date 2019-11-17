package me.helllp.sss.data.service;

import java.util.List;

import me.helllp.sss.data.bean.PagesBean;
import me.helllp.sss.data.bean.TenantBean;

/**
 * 租户信息接口
 * 
 * @author 林晓明
 *
 */
public interface TenantDataService {
	/**
	 * 基于租户ID，进行租户信息查询
	 * 
	 * @param id
	 * @return
	 */
	public TenantBean searchTenant(String id);
	
	/**
	 * 查询指定用户是否在租户中
	 * 
	 * @param userId		用户ID
	 * @param tenantId		租户ID
	 * @return
	 */
	public boolean hasUserInTenant(String userId, String tenantId);
	
	/**
	 * 查询当前系统有多少租户
	 * 
	 * @return
	 */
	public Long countTenant();
	
	/**
	 * 根据查询条件，进行分页查询（具体查询逻辑可以自行实现）
	 * 
	 * @param pagesInfo
	 * @param bean
	 * @return
	 */
	public List<TenantBean> searchTenantList(PagesBean pagesInfo, TenantBean bean);
	
	/**
	 * 创建租户，返回租户ID
	 * 
	 * @param bean
	 * @return
	 */
	public String createTenant(TenantBean bean);
	
	/**
	 * 删除租户
	 * 
	 * @param id
	 * @return
	 */
	public boolean deleteTenant(String id);
	
	/**
	 * 更新租户
	 * 
	 * @param bean
	 * @return
	 */
	public boolean updateTenant(TenantBean bean);
}
