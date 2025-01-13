package day03;

public class PromotionEx {
    public static void main(String[] args) {
        char charValue = '가';
        int intValue = charValue;
        System.out.println(intValue);
        char charValue1 = (char)intValue;
        System.out.println(charValue1);

        intValue = 100;
        long longValue = intValue;

        float floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println(floatValue);
        System.out.println(doubleValue);

        int intValue2 = 500;
        byte byteValue2 = (byte)intValue2;
        System.out.println(byteValue2);

        long longValue3 = 300;

        double doubleValue5 = 3.14;
        int intValue5  = (int) doubleValue5;
        System.out.println(intValue5);

    }
}
