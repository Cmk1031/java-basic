package day13.homework.class실습;

public class Book {
    //멤버변수
    private String title;
    private int price;

    //기본 생성자
    public Book() {
    }

    //멤버변수 초기화 생성자 메서드
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    //getter, setter 메서드
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
