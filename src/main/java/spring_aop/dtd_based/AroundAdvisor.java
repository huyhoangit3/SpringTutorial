package spring_aop.dtd_based;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object object;
        System.out.println("Additional concern before actual logic.");
        object = methodInvocation.proceed();
        System.out.println("Additional concern after actual logic.");
        return object;
    }
}
