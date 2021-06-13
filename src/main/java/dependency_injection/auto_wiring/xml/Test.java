package dependency_injection.auto_wiring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("dependency_injection/" +
                "auto_wiring/xml/applicationContext.xml");
        TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor1");
        textEditor.getSpellChecker().checkSpelling();
    }
}
