package dependency_injection.auto_wiring.xml;

public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor() {
    }

    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside constructor of TextEditor class.");
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    /*public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker method.");
        this.spellChecker = spellChecker;
    }*/
}
