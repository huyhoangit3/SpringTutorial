package dependency_injection.constructor_injecttion.ci_with_map_2;

import java.util.Date;

public class Answer {
    private int answerID;
    private String answerContent;
    private Date answerAt;

    public Answer(int answerID, String answerContent, Date answerAt) {
        this.answerID = answerID;
        this.answerContent = answerContent;
        this.answerAt = answerAt;
    }

    public int getAnswerID() {
        return answerID;
    }

    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public Date getAnswerAt() {
        return answerAt;
    }

    public void setAnswerAt(Date answerAt) {
        this.answerAt = answerAt;
    }
}
