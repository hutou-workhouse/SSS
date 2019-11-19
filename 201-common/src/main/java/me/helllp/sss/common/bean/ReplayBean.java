package me.helllp.sss.common.bean;

import lombok.Data;

/**
 * 重放攻击需要的参数Bean
 * 
 * @author 林晓明
 *
 */
@Data
public class ReplayBean {
	/**
	 * 时间戳
	 */
	private long stime;
	
	/**
	 * 随机数
	 */
	private long once;
}
