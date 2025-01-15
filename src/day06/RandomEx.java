package day06;

import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {
        Random random = new Random();
        int n1 = random.nextInt(4);
        System.out.println(n1);
    }
}
