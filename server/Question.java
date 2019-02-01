package server;

import java.util.UUID;

/**
 * Класс вопроса, который пользователь может задать опреленному количеству случайных людей,
 * выбранных определенным образом.
 */
public class Question {
    private String questonId;
    private String authorQuestionId;
    private String text;
    private int recipientNumber;
    private int time;
    //Filter[] filters;

    /**
     * Конструктор вопроса
     * @param authorQuestionId        - id автора вопроса
     * @param text            - текст вопроса
     * @param recipientNumber - количество случайных получателе
     * @param time            - время вопроса в минутах (возможно тип int не подходит и нужнно использовать встроенные средства типа Timer или т.п.)
     */

    public Question(String authorQuestionId, String text, int recipientNumber, int time) {
        /**id вопроса нужен, чтобы к нему можно было "привязывать" ответы*/
        this.questonId = UUID.randomUUID().toString();
        this.authorQuestionId = authorQuestionId;
        this.text = text;
        this.recipientNumber = recipientNumber;
        this.time = time;
    }

    public String getQuestonId() {
        return questonId;
    }

    public String getAuthorQuestionId() {
        return authorQuestionId;
    }

    public String getText() {
        return text;
    }

    public int getRecipientNumber() {
        return recipientNumber;
    }

    public void setRecipientNumber(int recipientNumber) {
        this.recipientNumber = recipientNumber;
    }

    public int getTime() {
        return time;
    }
}
