/*
 *Класс пользователя.
 */
package client;

import java.util.UUID;

public class MindExplorer {

    /**Поле количества пользователей в системе*/
    //private static BigDecimal numberOfExplorers = BigDecimal.ZERO;

    /**
     * Идентификатор пользователя
     */
    private String id;

    /**
     * Имя пользователя
     */
    private String name;

    /**
     * Количество очков пользователя
     */
    private long score;

    /**
     * Пол пользователя
     */
    private String sex;

    /**
     * Год рождения пользователя
     */
    private int year;

    /**
     * Конструктор пользователя по умолчанию
     */
    public MindExplorer(String name, int year, String sex) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.score = ClientConstants.INITIAL_SCORES_OF_MIND_EXPLORER;
        this.year = year;
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }




}
