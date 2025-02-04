package day12.multiInhe;

public class SubFather extends GrandFather {
    String familyName = "프로그래머";
    String houseAddress = "인천";

    public void printFather() {
        System.out.println("나는 아버지, 할아버지로부터 상속 받음");
    }
}
