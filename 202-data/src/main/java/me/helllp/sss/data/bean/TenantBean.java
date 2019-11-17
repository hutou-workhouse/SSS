package me.helllp.sss.data.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 租户信息
 * 
 * @author 林晓明
 *
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class TenantBean extends BaseDataBean{
	private static final long serialVersionUID = -4470079494894206106L;

	/**
	 * 租户ID
	 */
	private String tenantId;
	
	/**
	 * 租户名称
	 */
	private String tenantName;
	
	/**
	 * 租户说明
	 */
	private String memo;
}
