package dependency_injection.constructor_injecttion.ci_with_collection_1;

import java.util.List;

public class Question {
    private int qid;
    private String qName;
    private List<String> answers;

    public Question(int qid, String qName, List<String> answers) {
        this.qid = qid;
        this.qName = qName;
        this.answers = answers;
    }

    public void displayDetails() {
        System.out.println("Question ID: " + qid);
        System.out.println("Question name: " + qName);
        // Khong dung duoc method reference.
        for (String answer : answers) {
            System.out.println(answer);
        }
    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getqName() {
        return qName;
    }

    public void setqName(String qName) {
        this.qName = qName;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
