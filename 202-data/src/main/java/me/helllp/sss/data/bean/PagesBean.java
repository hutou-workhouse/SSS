package me.helllp.sss.data.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 分页输入信息结构
 * 
 * @author 林晓明
 *
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class PagesBean extends BaseDataBean{
	private static final long serialVersionUID = -8848955551886059914L;

	/**
	 * 当前页码
	 */
	private Integer pages;
	
	/**
	 * 每页显示条数
	 */
	private Integer size;
}
