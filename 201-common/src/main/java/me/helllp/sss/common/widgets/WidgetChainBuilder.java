package me.helllp.sss.common.widgets;

import java.util.Collection;

/**
 * 挂件链构造器
 * 
 * @author 林晓明
 *
 */
public class WidgetChainBuilder {

	/**
	 * 注册挂件
	 * 
	 * @param collWidget
	 * @return
	 */
	public static Widget builder(Collection<Widget> collWidget){
		Widget ww = null;
		
		for(Widget w : collWidget){
			if(ww == null){
				ww = w;
			}
			ww = ww.register(w);
		}
		return ww;
	}
}
