package dependency_injection.constructor_injecttion.ci_with_collection_2;

public class Answer {
    private int answerId;
    private String answerContent;
    private String answerBy;

    public Answer(int answerId, String answerContent, String answerBy) {
        this.answerId = answerId;
        this.answerContent = answerContent;
        this.answerBy = answerBy;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public String getAnswerBy() {
        return answerBy;
    }

    public void setAnswerBy(String answerBy) {
        this.answerBy = answerBy;
    }
}
