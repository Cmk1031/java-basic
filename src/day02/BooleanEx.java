package day02;

import java.util.Scanner;

public class BooleanEx {
    public static void main(String[] args) {
        //참과 거짓을 의미하는 논리 리터럴 true, false...
        /*
        두 가지 상태값을 저장할 필요가 있을 경우, 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는데 사용
        연산식 중 비교, 논리 연산의 산출값을 판단할 때 사용
         */
        boolean stop = true;
        boolean start = false;

        int bool = 10;
        boolean result = bool == 20;
        System.out.println(result);

        System.out.println(bool==20);
        System.out.println(0<bool && bool<20);




    }
}
