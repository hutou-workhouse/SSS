package me.helllp.sss.common.bean;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import me.helllp.sss.data.bean.ResourceBean;

/**
 * 请求的widget配置信息
 * 
 * @author 林晓明
 *
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class RequestWidgetBean extends WidgetBean{
	/**
	 * 例外的资源列表
	 */
	private List<ResourceBean> exclusions;
}
