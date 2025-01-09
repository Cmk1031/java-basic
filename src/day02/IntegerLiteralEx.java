package day02;

public class IntegerLiteralEx {
    public static void main(String[] args) {
        //1011Gallery

        int x = 0b1011;
        System.out.println(x);

        //16진수 0x, 0x로 시작하고 0~9 숫자 그대로, 10~15 A~F, a~f로 표현한다.
        int z = 0xB;
        System.out.println(z);

        /*
        10진수 11(2진수로), 134(8진수로), 365(10진수), 179(16진수로)
        리터럴 처리하여 var1,2,3,4에 저장, 10진수로 출력
         */
        //1 2 4 8 16 32 64 128
        //8 16 32 64 128

        /*10 000 110

        1011 0011
        */

        int var1 = 0b1011;
        int var2 = 0206;
        int var3 = 365;
        int var4 = 0XB3;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);



    }
}
