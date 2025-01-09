package day02;

import java.util.Scanner;

public class TotalEx01 {
    //멤버변수
    static Scanner input = new Scanner(System.in);

    //사칙연산 기능 메서드 fourArithmetic
    static void fourArithmetic() {
        System.out.println("첫번째 숫자를 입력하세요!");
        int a = input.nextInt();

        System.out.println("두번째 숫자를 입력하세요!");
        int b = input.nextInt();

        System.out.println("a+b="+ (a+b));
        System.out.println("a-b="+ (a-b));
        System.out.println("a*b="+ a*b);
        System.out.println("a/b="+a/b);
    }

    //operator 기능 메서드
    static void operator() {
        System.out.println("국어점수를 입력하세요!");
        int a = input.nextInt();

        System.out.println("영어점수를 입력하세요!");
        int b = input.nextInt();

        System.out.println("총합: "+ (a+b));
        System.out.println("평균: "+ (a+b)/2);

    }
    //실행 메서드
    public static void main(String[] args) {
        System.out.println("fourArithmetic 메서드");
        fourArithmetic();
        System.out.println("operator 메서드");
        operator();
    }
}
