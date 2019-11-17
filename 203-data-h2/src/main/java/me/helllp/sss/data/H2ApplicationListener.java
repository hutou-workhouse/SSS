package me.helllp.sss.data;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;

public class H2ApplicationListener implements ApplicationListener<SpringApplicationEvent>{

	@Override
	public void onApplicationEvent(SpringApplicationEvent event) {
		if(event instanceof ApplicationEnvironmentPreparedEvent){
			ApplicationEnvironmentPreparedEvent e = (ApplicationEnvironmentPreparedEvent)event;
			
			ConfigurableEnvironment env = e.getEnvironment();
		}
	}



}
