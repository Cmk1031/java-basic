package day03;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("x의 값 입력");
        String strX = input.nextLine();
        int x = Integer.parseInt(strX);
        System.out.println(x);

        System.out.println("y의 값 입력");
        String strY = input.nextLine();
        int y = Integer.parseInt(strY);
        System.out.println(y);

        System.out.println("x와 y의 합: "+ (x+y));

        /*
        문자열은 연산이 되지 않기 때문에 래퍼클래스를 이용해서 변환한다.
         */
    }
}
