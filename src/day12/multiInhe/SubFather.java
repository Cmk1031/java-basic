package day12.multiInhe;

public class SubFather extends GrandFather {
    String familyName = "가족이름";
    String houseAddress = "우리집";

    public void printFather() {
        System.out.println(familyName);
        System.out.println(houseAddress);
        System.out.println("나는 아버지, 할아버지로부터 상속 받음");
    }
}
