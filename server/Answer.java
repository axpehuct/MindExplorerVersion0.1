package server;

import java.util.UUID;

public class Answer {
    private String questionId;
    private String answerId;
    private String authorAnswerId;
    private String text;
    private int points = 0;

    public Answer(String questionId, String authorAnswerId, String text){
        this.answerId = UUID.randomUUID().toString();
        this.questionId = questionId;
        this.authorAnswerId = authorAnswerId;
        this.text = text;
    }

    public String getQuestionId() {
        return questionId;
    }

    public String getAnswerId() {
        return answerId;
    }

    public String getAuthorAnswerId() {
        return authorAnswerId;
    }

    public String getText() {
        return text;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
