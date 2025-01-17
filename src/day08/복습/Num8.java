package day08.복습;

public class Num8 {
    public static void main(String[] args) {
        int[][] arrays = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };
        int sum = 0;
        int cnt = 0;
        for (int[] array : arrays) {
            for (int i : array) {
                sum+=i;
                cnt++;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum/cnt);
    }
}
