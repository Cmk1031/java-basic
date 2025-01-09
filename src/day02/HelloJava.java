package day02;

import java.util.Scanner;

public class HelloJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello Java");
        callName();
        System.out.println("당신의 이름을 입력해 주세요.");
        String name = input.nextLine();

        System.out.println("당신의 이름은 "+ name);
        callName();
        String eat = callStringName();
        System.out.println(eat);

        eat +="냠냠";

        callStringParam(eat);
    }
    public static void callName() {
        System.out.println("내 이름!");
    }

    public static String callStringName() {
        String name = "라면";
        return name;
    }

    public static void callStringParam(String eat) {
        System.out.println(eat + "callString Param 처리 완료 ");
    }

}
