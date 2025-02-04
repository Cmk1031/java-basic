package day13.homework.Inheritance실습.level01;

public class Drink {
    //멤버 변수
    private String name;
    private int price;
    private int count;

    //생성자
    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    //단가*수량 금액을 계산
    public int getTotalPrice() {
        return price*count;
    }

    //타이틀 출력
    public static void printTitle() {
        System.out.println("상품명\t단가\t수량\t금액");
    }

    //상품 정보 출력
    public void printData() {
        System.out.println(name+"\t"+price+"\t"+count+"\t"+getTotalPrice());
    }
}
