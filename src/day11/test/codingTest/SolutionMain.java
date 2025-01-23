/*
package day11.test.codingTest;

import java.util.ArrayList;

public class SolutionMain {
    public static void main(String[] args) {
        ArrayList<Integer>[] arrayList = new ArrayList[10000];
        //라인 수
        int lineNumber = line.length;
        int k = 0;
        for(int i=0; i<lineNumber; i++) {
            double a = line[i][0];
            double b = line[i][1];
            double c = line[i][2];
            for(int j=i+1; j<lineNumber; j++) {
                //meet(line[i], line[j], arrayList);
                double d = line[j][0];
                double e = line[j][1];
                double f = line[j][2];

                double x = (b*f-e*d)/(a*d-b*c);
                double y = (e*c-a*f)/(a*d-b*c);

                double checkX = x%1;
                double checkY = y%1;
                if(checkX==0 && checkY==0) {
                    arrayList[k].add((int)x);
                    arrayList[k].add((int)y);
                }
            }
        }

        for (ArrayList<Integer> integers : arrayList) {
            System.out.println(integers);
        }


    }
}
*/
