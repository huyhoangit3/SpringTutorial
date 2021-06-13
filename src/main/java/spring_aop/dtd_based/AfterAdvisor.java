package spring_aop.dtd_based;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class AfterAdvisor implements AfterReturningAdvice {
    /**
     *
     * @param o - returned object
     * @param method - method will be call
     * @param objects - arguments of method
     * @param o1 - target object
     */

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) {
        System.out.println("\n========AFTER========");
        // print method name
        System.out.println("Method name: " + method.getName());
        // print arguments of method
        System.out.println("Method arguments: " + Arrays.toString(objects));
        // print class of object target
        System.out.println("Type of target object: " + o1.getClass().getSimpleName());
        // print class of returned object
        System.out.println("Type of returned object: " + o.getClass().getSimpleName());
        System.out.println("=======================");
    }
}
