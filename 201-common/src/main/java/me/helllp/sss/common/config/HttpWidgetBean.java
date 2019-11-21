package me.helllp.sss.common.config;

import java.util.Collections;
import java.util.List;

import lombok.Data;
import me.helllp.sss.common.bean.RequestWidgetBean;
import me.helllp.sss.common.bean.ResponseWidgetBean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * widget的配置信息
 * 
 * @author 林晓明
 *
 */
@Configuration
@ConfigurationProperties(prefix="sss.widget")
@Data
public class HttpWidgetBean {
	/**
	 * request的配置信息
	 */
    private List<RequestWidgetBean> request = Collections.emptyList();
    
    /**
     * response的配置信息
     */
    private List<ResponseWidgetBean> response = Collections.emptyList();
}
