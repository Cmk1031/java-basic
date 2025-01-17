package day08;

public class MultiEx {
    public static void main(String[] args) {

        int [][] scores = {
                {80,90,96},
                {76,88}
        };
        int sum = 0;
        int cnt = 0;

        for(int num:scores[1]) {
            sum+=num;
        }

        for (int[] score : scores) {
            for (int i : score) {

            }
        }


        double avg = (double)sum/ cnt;
        System.out.println("sum = " + sum);
        System.out.printf("avg = %.1f",avg);

    }
}
