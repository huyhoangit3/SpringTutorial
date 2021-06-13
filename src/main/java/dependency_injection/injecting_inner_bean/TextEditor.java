package dependency_injection.injecting_inner_bean;

public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor() {
    }

    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker method.");
        this.spellChecker = spellChecker;
    }
}
