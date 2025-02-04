package day13.homework.Inheritance실습.level01;

public class Alcohol extends Drink{
    //알콜 도수 멤버 변수
    private double alceper;
    private String name;
    private int price;
    private int count;

    //멤버 변수 초기화
    public Alcohol(String name, int price, int count, double alceper) {
        super(name,price,count);
        this.name = name;
        this.price = price;
        this.count = count;
        this.alceper = alceper;
    }

    //Drink의 printTitle() 오버라이딩
    public static void printTitle() {
        System.out.println("상품명(도수[%])\t단가\t수량\t금액");
    }

    //Drink의 printData() 오버라이딩
    @Override
    public void printData() {
        System.out.println(name+"("+alceper+")"+"\t"+price+"\t"+count+"\t"+getTotalPrice());

    }


}
