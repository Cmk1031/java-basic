package day10.dto;

import java.util.Date;

public class MovieDTO {
    String title;
    Date stratDate;
    String actor;
    String gener;
    String runningTime;
    String grade;

    public MovieDTO(String title, Date stratDate, String actor, String gener, String runningTime, String grade) {
        this.title = title;
        this.stratDate = stratDate;
        this.actor = actor;
        this.gener = gener;
        this.runningTime = runningTime;
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStratDate() {
        return stratDate;
    }

    public void setStratDate(Date stratDate) {
        this.stratDate = stratDate;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
