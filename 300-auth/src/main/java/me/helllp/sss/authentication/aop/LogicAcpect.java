package me.helllp.sss.authentication.aop;

import lombok.extern.log4j.Log4j2;
import me.helllp.sss.common.config.HttpWidgetBean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Log4j2
public class LogicAcpect {
    @Pointcut("execution(public * me.helllp.sss.authentication.rest..*.*(..))")
    public void authLogic(){}
    
    @Autowired
    private HttpWidgetBean wid;
    
    @Before("authLogic()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {
    	log.info(wid.getRequest().get(0).getName());
    	log.info("run before");
    }
    
    @AfterReturning(returning = "ret",pointcut = "authLogic()")
    public void doAfterReturning(Object ret) throws Throwable {
    	log.info("run after");
    }
}
