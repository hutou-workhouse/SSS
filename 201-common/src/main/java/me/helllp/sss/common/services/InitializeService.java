package me.helllp.sss.common.services;

import org.springframework.core.env.Environment;

/**
 * 服务初始化接口
 * 
 * @author 林晓明
 *
 */
public interface InitializeService {
	public void initService(Environment e);
}
