package me.helllp.sss.common.widgets;

import me.helllp.sss.common.exception.WidgetRunException;

/**
 * 小挂件接口
 * 
 * @author 林晓明
 *
 */
public interface Widget {
	/**
	 * 挂件的排序，数字小的先执行
	 * 
	 * @return
	 */
	public int order();
	
	/**
	 * 获取下一个挂件
	 * 
	 * @return
	 */
	public Widget next();
	
	/**
	 * 挂件执行
	 */
	public void run() throws WidgetRunException;
	
	/**
	 * 注册挂件，返回挂件链的TOP
	 * 
	 * @param w
	 * @return
	 */
	public Widget register(Widget w);
}
