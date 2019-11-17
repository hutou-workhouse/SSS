package me.helllp.sss.data.bean;

import java.io.Serializable;
import java.util.Map;

import lombok.Data;

/**
 * 对数据层提供统一的Bean基类
 * 
 * @author 林晓明
 *
 */
@Data
public class BaseDataBean implements Serializable{
	private static final long serialVersionUID = 5312493208150813338L;
	
	private Map<String,Object> selfInfo = null;
}
