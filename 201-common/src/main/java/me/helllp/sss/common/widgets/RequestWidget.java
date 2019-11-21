package me.helllp.sss.common.widgets;

import java.util.Collections;
import java.util.List;

import me.helllp.sss.common.bean.RequestWidgetBean;
import me.helllp.sss.common.bean.WidgetBean;
import me.helllp.sss.data.bean.ResourceBean;


/**
 * 请求体小挂件
 * 
 * @author 林晓明
 *
 */
public interface RequestWidget extends Widget{
	static final List<ResourceBean> EMPTY_RES_ARRYS = Collections.emptyList();
	
	/**
	 * 例外的资源列表
	 *  
	 * @return
	 */
	public default List<ResourceBean> getExclusions(){
		WidgetBean bean = this.getWidgetInfo();
		
		if(bean instanceof RequestWidgetBean){
			return ((RequestWidgetBean) bean).getExclusions();
		}
		return EMPTY_RES_ARRYS; 
	}	
}
