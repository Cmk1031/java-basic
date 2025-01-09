package day02;

public class FourArithmetic {
    public static void main(String[] args) {

        int a = 12;
        int b = 2;
        plus(a,b);
        minus(a,b);
        mul(a,b);
        div(a,b);
    }

    public static void plus(int a, int b) {
        System.out.printf("a+b=%d\n", a+b);
    }

    public static void minus(int a, int b) {
        System.out.printf("a-b=%d\n", a-b);
    }

    public static void mul(int a, int b) {
        System.out.printf("a*b=%d\n", a*b);
    }

    public static void div(int a, int b) {
        System.out.printf("a/b=%d\n", a/b);
    }

}
