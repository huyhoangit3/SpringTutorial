package dependency_injection.constructor_injecttion.ci_with_map_2;

import java.util.Map;

public class Question {
    private int qid;
    private String qContent;
    private Map<Answer, User> answers;

    public Question(int qid, String qContent, Map<Answer, User> answers) {
        this.qid = qid;
        this.qContent = qContent;
        this.answers = answers;
    }

    public void displayDetails() {
        System.out.println("Question id: " + qid);
        System.out.println("Question content: " + qContent);
        for (Map.Entry<Answer, User> entry: answers.entrySet()) {
            Answer answer = entry.getKey();
            User user = entry.getValue();
            System.out.println("  ++ Answer ID: " + answer.getAnswerID() + "\tAnswer content: " +
                    answer.getAnswerContent() + "\tAnswer at: " + answer.getAnswerAt());
            System.out.println("  ++ User ID: " + user.getUid() + "\tUsername: " + user.getUsername() +
                    "\tUser address: " + user.getAddress() + "\tUser score: " + user.getScore());
            System.out.println("==============================");
        }
    }
    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public String getqContent() {
        return qContent;
    }

    public void setqContent(String qContent) {
        this.qContent = qContent;
    }

    public Map<Answer, User> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Answer, User> answers) {
        this.answers = answers;
    }
}
