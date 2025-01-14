package day05.Test;

public class MorningTest7 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (float)(5.0/9.0) * (fahrenheit - 32);
        System.out.println("Fah: " + fahrenheit);
        System.out.printf("Cel: %.2f",celcius);
    }
}
