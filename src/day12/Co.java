package day12;

import java.util.Enumeration;

public class Co {
    public static void main(String[] args) {
        /*int n = 4;
        int num = 0;
        int index = 0;
        int[] array = new int[100];
        int i=0;
        int j=0;
        while(true) {

        }*/
        int n = 4;
        int x = -1;
        int y = 0;
        int num = 1;
        int[][] array = new int[n][n];
        int[] answer = new int[n * (n + 1) / 2];
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (i % 3 == 0) {
                    x++;
                } else if (i % 3 == 1) {
                    y++;
                } else if (i % 3 == 2) {
                    x--;
                    y--;
                }
                array[x][y] = num++;
            }
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (k == n * (n + 1) / 2) {
                    break;
                } else if(array[i][j]!=0) {
                    answer[k++] = array[i][j];
                }
            }
        }
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
