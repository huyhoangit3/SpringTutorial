package dependency_injection.auto_wiring.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("dependency_injection/" +
                "auto_wiring/annotation/applicationContext.xml");
        TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor2");
        textEditor.getSpellChecker().checkSpelling();
        applicationContext.registerShutdownHook();
    }
}
