package dependency_injection.constructor_injecttion.ci_with_collection_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("dependency_injection/" +
                "constructor_injecttion/ci_with_collection_1/applicationContext.xml");
        Question question = (Question) applicationContext.getBean("question1");
        question.displayDetails();
    }
}
