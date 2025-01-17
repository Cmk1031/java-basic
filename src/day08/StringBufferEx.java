package day08;

public class StringBufferEx {
    public static void main(String[] args) {
        //StringBuffer의 기본 사이즈는 16개의 문자를 저장할 수 있다.
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();
        sb.append("welcome");
        sb.append("welcome");
        sb.append("welcome");
        sb.append("welcome");
        sb.append("welcome");

        String result = sb.toString();
        System.out.println(result);
        System.out.println(sb.capacity());

        sb1.append("1111111111111111111111111");
        System.out.println(sb1.capacity());
        result = sb1.toString();
        System.out.println(result);
        String string = "1234";
        StringBuffer sb2 = new StringBuffer(string);

        System.out.println(sb2);
        //StringBuffer -> String
        System.out.println(sb2.toString());
        System.out.println(sb2.substring(2));
        System.out.println(sb2.insert(1,5));
        System.out.println(sb2.delete(1,2));
        System.out.println(sb2.append("하하호호"));
        System.out.println(sb2.length());
        System.out.println(sb2.reverse());
        System.out.println(sb2.toString());

        StringBuffer sb3 = new StringBuffer("*");
        sb3.append("********");

        String a = "*";
        a+="********";
        System.out.println(a);

        String str3 = "hello" + "world";
        String str4 = new StringBuilder("hello").append("world").toString();


        /*
        문자열 연산이 많은 경우 처음부터 StringBuilder 객체로 문자열을 생성해서
        다루는 것이 성능을 고려하는데 좋다.
         */
        StringBuilder sb4 = new StringBuilder();
        for(int i=0; i<10000; i++) {
            sb4.append(i);
        }
        final String number = sb4.toString();
        System.out.println(number);

    }
}
