package springbootwebsite.simplewebsite.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ControllerAcpect {
    private static final Logger logger = LogManager.getLogger(ControllerAcpect.class);

    @Around(value = "execution(* springbootwebsite.simplewebsite.controller.InfoController.*(..))")
    public Object logServiceCall(ProceedingJoinPoint j) throws Throwable {
        logger.info("Service " + j.getSignature().getName().toString() + " has been called");
        Object retVal = j.proceed();
        logger.info("Service " + j.getSignature().getName().toString() + " returned value: " + retVal.toString());
        return retVal;
    }
}
