package day05;

public class MorningTest10 {
    public static void main(String[] args) {
        //대문자 -> 소문자
        //대문자인 경우에만 소문자로 변경
        //32만큼 더 크다
        char ch = 'A';
        char lowerCase = (ch>=65 && ch<=90) ? (char) (ch + 32) : ch;

        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }
}
