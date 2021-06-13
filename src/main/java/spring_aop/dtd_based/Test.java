package spring_aop.dtd_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring_aop/dtd_based/applicationContext.xml");
        PrintService printService = (PrintService) applicationContext.getBean("proxy");
        try {
            System.out.println(printService.printHelloTo("Luong Ba Hoang"));
        } catch (PrinterProblem printerProblem) {
            System.err.println(printerProblem.getMessage());
        }
    }
}
