package day11.test.codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    /*
     // ArrayList 선언
        ArrayList<int[]> arrayList = new ArrayList<>();

        // 첫 번째 인덱스에 배열 {0, 1} 추가
        arrayList.add(new int[]{0, 1});

        // 두 번째 인덱스에 배열 {1, 2} 추가
        arrayList.add(new int[]{1, 2});

        // 출력
        for (int[] arr : arrayList) {
            System.out.println(Arrays.toString(arr));
        }
     */

    public String[] solution(int[][] line) {
        int[][] arrayList = new int[10000][2];
        //라인 수
        int lineNumber = line.length;
        int k = 0;
        for(int i=0; i<lineNumber; i++) {
            double a = line[i][0];
            double b = line[i][1];
            double c = line[i][2];
            for(int j=i+1; j<lineNumber; j++) {

                double d = line[j][0];
                double e = line[j][1];
                double f = line[j][2];

                double x = (b*f-e*d)/(a*d-b*c);
                double y = (e*c-a*f)/(a*d-b*c);

                double checkX = x%1;
                double checkY = y%1;
                if(checkX==0 && checkY==0) {
                    x = arrayList[k][0];
                    y = arrayList[k][1];
                    k++;
                }
            }
        }

        for (int[] array : arrayList) {
            for (int i : array) {
                System.out.print(i);
                System.out.println();
            }
        }
        String[] answer = {};
        return answer;
    }
//    public static void meet(int[] line1, int[] line2, ArrayList<Integer>[] arrayList) {
//        //좌표 저장 array
//        double a = line1[0];
//        double b = line1[1];
//        double c = line1[2];
//        double d = line2[0];
//        double e = line2[1];
//        double f = line2[2];
//
//        double x = (b*f-e*d)/(a*d-b*c);
//        double y = (e*c-a*f)/(a*d-b*c);
//
//        double checkX = x%1;
//        double checkY = y%1;
//        if(checkX==0 && checkY==0) {
//
//        }
//    }
}
