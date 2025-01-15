package day06;

import java.util.Scanner;

public class KeyControlEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean run = true;

        while(run) {
            System.out.println("------------------");
            System.out.println("1. 속도증가, 2. 감속 3. 중지");

            String strNum = in.nextLine();
            int speed = 0;
            if(strNum.equals("1")) {
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if(strNum.equals("2")) {
                speed--;
                System.out.println("현재 속도 = "+ speed);
            } else if(strNum.equals("3")) {
                run = false;
            }
        }
    }
}
