package com.chainOfResponsibility;

/**
 * 请假条
 * @authoor lengchuan
 * @date 16-6-3
 */
public class LeaveStrip {

    private String title;

    private String person;

    private int days;

    public LeaveStrip(String title, String person, int days) {
        this.title = title;
        this.person = person;
        this.days = days;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
