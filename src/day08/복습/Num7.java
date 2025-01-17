package day08.복습;

public class Num7 {
    public static void main(String[] args) {
        int[] array = {1,5,3,8,2};
        int max = 0;
        for (int i : array) {
            if(i >=max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
