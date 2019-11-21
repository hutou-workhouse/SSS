package me.helllp.sss.common.widgets;

import me.helllp.sss.common.bean.WidgetBean;
import me.helllp.sss.common.exception.WidgetRunException;

/**
 * 小挂件接口
 * 
 * @author 林晓明
 *
 */
public interface Widget {
	/**
	 * 设置挂件信息
	 * 
	 * @param bean
	 */
	public void setWidgetInfo(WidgetBean bean);
	
	/**
	 * 获取挂件配置信息
	 * 
	 * @return
	 */
	public WidgetBean getWidgetInfo();
	
	/**
	 * 获取下一个挂件
	 * 
	 * @return
	 */
	public Widget next();
	
	/**
	 * 设置下一个挂件
	 * 
	 * @param w
	 */
	public void setNext(Widget w);
	
	/**
	 * 挂件执行
	 */
	public void run() throws WidgetRunException;
}
