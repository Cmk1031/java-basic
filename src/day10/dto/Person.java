package day10.dto;

public class Person {
    String name;
    int age;
    private String phone;

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String play() {
        return "운동!";
    }

    public String eat() {
        return "먹기!";
    }
}
