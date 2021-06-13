package dependency_injection.injecting_inner_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("dependency_injection/" +
                "injecting_inner_bean/applicationContext.xml");
        TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
        textEditor.getSpellChecker().checkSpelling();
    }
}
