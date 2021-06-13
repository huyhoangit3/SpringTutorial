package dependency_injection.constructor_injecttion.ci_with_map_1;

import java.util.Map;

public class Question {
    private int qId;
    private String qContent;
    private Map<String, String> answers;

    public Question(int qId, String qContent, Map<String, String> answers) {
        this.qId = qId;
        this.qContent = qContent;
        this.answers = answers;
    }

    public void displayDetails() {
        System.out.println("Question id: " + qId);
        System.out.println("Question content: " + qContent);
        for (Map.Entry<String, String> entry : answers.entrySet()) {
            System.out.println(" ++Answer content: " + entry.getKey() + "\tAnswer by: " +
                    entry.getValue());
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

    public Map<String, String> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<String, String> answers) {
        this.answers = answers;
    }
}
