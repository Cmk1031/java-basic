package day08;

//자바 문자열 자르는 2가지 방법
/*
1. String 클래스의 split()
2. StringTokenizer 클래스
 */
public class StringSplitEx {
    public static void main(String[] args) {
        String s = "12,34,56,78";
        String[] splitter = s.split(",@",0);
        for (String string : splitter) {
            System.out.println(string);
        }


        int i=0;
        for (String data : splitter) {
            System.out.printf("% d 위치 : %s\n", ++i, data);
        }

    }
}
