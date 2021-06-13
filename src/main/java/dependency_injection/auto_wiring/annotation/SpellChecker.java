package dependency_injection.auto_wiring.annotation;

import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
    public SpellChecker() {
    }

    public void checkSpelling() {
        System.out.println("Inside checkSpelling.");
    }
    public void init() {
        System.out.println("Init method.");
    }
    public void destroy() {
        System.out.println("Destroy method.");
    }
}
