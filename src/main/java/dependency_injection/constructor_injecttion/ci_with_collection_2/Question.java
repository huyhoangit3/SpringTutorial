package dependency_injection.constructor_injecttion.ci_with_collection_2;

import java.util.List;

public class Question {
    private int qId;
    private String qContent;
    private List<Answer> answers;

    public Question(int qId, String qContent, List<Answer> answers) {
        this.qId = qId;
        this.qContent = qContent;
        this.answers = answers;
    }

    public void displayDetails() {
        System.out.println("Question id: " + qId);
        System.out.println("Question content: " + qContent);
        System.out.println("=====ANSWERS=====");
        for (Answer answer : answers) {
            System.out.println(" ++ AnswerID: " + answer.getAnswerId() + "\tAnswer content: " +
                    answer.getAnswerContent() + "\tAnswer by: " + answer.getAnswerBy());
        }
    }
    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    public String getqContent() {
        return qContent;
    }

    public void setqContent(String qContent) {
        this.qContent = qContent;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
