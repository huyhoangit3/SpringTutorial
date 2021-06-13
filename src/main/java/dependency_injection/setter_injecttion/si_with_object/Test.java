package dependency_injection.setter_injecttion.si_with_object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("dependency_injection/" +
                "setter_injecttion/si_with_object/applicationContext.xml");
        Worker worker = (Worker) applicationContext.getBean("worker");
        System.out.println(worker);
    }
}
