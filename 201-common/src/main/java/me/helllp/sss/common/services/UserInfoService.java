package me.helllp.sss.common.services;

import me.helllp.sss.data.bean.UserInfoBean;

/**
 * 用户信息获取接口
 * 
 * @author 林晓明
 *
 */
public interface UserInfoService extends InitializeService{
	public UserInfoBean getUserInfo();
}
