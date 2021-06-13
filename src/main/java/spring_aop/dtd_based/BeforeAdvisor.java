package spring_aop.dtd_based;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class BeforeAdvisor implements MethodBeforeAdvice {
    // method: Ten method se duoc goi
    // objects: arguments of method
    // o: object target
    @Override
    public void before(Method method, Object[] objects, Object o) {
        System.out.println("========BEFORE========");
        // print method name
        System.out.println("Method name: " + method.getName());
        // print arguments of method
        System.out.println("Method arguments: " + Arrays.toString(objects));
        // print class of object target (
        System.out.println("Type of target object: " + o.getClass().getSimpleName());
        System.out.println("=======================");
    }
}
