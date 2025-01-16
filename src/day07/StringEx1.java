package day07;

public class StringEx1  {
    public static void main(String[] args) {
        String ssn = "9910311234567";
        char gender = ssn.charAt(6);
        System.out.println(gender);

        //문자열 길이
        int length = ssn.length();
        System.out.println(length);

        //문자열 대체
        String oldStr = "자바 프로그래밍";
        String newStr = "혼자 공부하는 자바 프로그래밍";
        String printStr1 = oldStr.replace("자바", "JAVA");
        String printStr2 = newStr.replace("혼자 공부하는", "다 함께 공부하는");
        System.out.println(printStr1 + " " + printStr2);

        //문자열 자르기
        String a = oldStr.substring(0, 3);
        System.out.println(a);
        System.out.println(oldStr.substring(3));

        //문자열 찾기
        int i = newStr.indexOf("프로그래밍");
        System.out.println(i);
        String printStr4 = newStr.substring(i);
        System.out.println(printStr4);

        //문자열 분리: 구분자를 통해 문자열 분리
        String board = "1,제목,내용,작성자,파일";
        String[] tokens = board.split(",");
        for (String token : tokens) {
            System.out.println(token);
        }



    }
}
