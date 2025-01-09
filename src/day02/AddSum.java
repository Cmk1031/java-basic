package day02;

import java.util.Scanner;

public class AddSum {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int value = 10;
        int sum = 0;

        System.out.println("숫자를 입력하세요!");
        sum += value;
        addSum(sum);
    }

    public static void addSum(int sum) {
        int value = input.nextInt();
        sum+=value;
        System.out.println(sum);
    }
}
