package day11.test;

public class MovieVO {
    private String title;
    private String openDay;
    private String actor;
    private String runtime;
    private String gener;
    private String grade;

    public MovieVO(){
    }

    public MovieVO(String title, String openDay, String actor, String runtime, String gener, String grade) {
        this.title = title;
        this.openDay = openDay;
        this.actor = actor;
        this.runtime = runtime;
        this.gener = gener;
        this.grade = grade;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOpenDay() {
        return openDay;
    }

    public void setOpenDay(String openDay) {
        this.openDay = openDay;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
