package me.helllp.sss.common.config;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import me.helllp.sss.common.bean.RequestWidgetBean;
import me.helllp.sss.common.bean.ResponseWidgetBean;
import me.helllp.sss.common.bean.WidgetBean;
import me.helllp.sss.common.widgets.RequestWidget;
import me.helllp.sss.common.widgets.ResponseWidget;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * 挂件构造器
 * 
 * @author 林晓明
 *
 */
@Component
public class WidgetBuilder {
	@Bean
	public RequestWidget buildRequestWidget(HttpWidgetBean bean) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		RequestWidget widget = null;
		List<RequestWidgetBean> sList = bean.getRequest().stream().sorted(Comparator.comparing(WidgetBean::getOrder).reversed()).collect(Collectors.toList());
		
		for(RequestWidgetBean b : sList){
			RequestWidget w = (RequestWidget)Class.forName(b.getName()).newInstance();
			w.setWidgetInfo(b);
			
			if(widget != null){
				widget.setNext(w);
			}

			widget = w;
		}
		
		return widget;
	}
	
	@Bean
	public ResponseWidget buildResponseWidget(HttpWidgetBean bean) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		ResponseWidget widget = null;
		List<ResponseWidgetBean> sList = bean.getResponse().stream().sorted(Comparator.comparing(WidgetBean::getOrder).reversed()).collect(Collectors.toList());
		
		for(ResponseWidgetBean b : sList){
			ResponseWidget w = (ResponseWidget)Class.forName(b.getName()).newInstance();
			w.setWidgetInfo(b);
			
			if(widget != null){
				widget.setNext(w);
			}

			widget = w;
		}
		
		return widget;
	}
}
