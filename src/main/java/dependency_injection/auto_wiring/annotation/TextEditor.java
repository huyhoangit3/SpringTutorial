package dependency_injection.auto_wiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {
    private SpellChecker spellChecker1;

    public TextEditor() {
    }

    // @Autowired // using constructor injection here
    // can not use @Qualifier here
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside constructor of TextEditor class.");
        this.spellChecker1 = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker1;
    }

    @Autowired //- using setter injection here
    @Qualifier("spellChecker1")
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker method.");
        this.spellChecker1 = spellChecker;
    }
}
