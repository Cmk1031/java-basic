package day08;

import java.util.StringTokenizer;

//문자열을 구분자를 기준으로 토큰(token)이라는 여러개의 문자열로 잘라낼때 사용
public class StringTokenEx {
    public static void main(String[] args) {
        String str = "welcome Java Programming";
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.countTokens());

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
