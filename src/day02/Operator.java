package day02;

public class Operator {
    public static void main(String[] args) {
        int kor = 77;
        int eng = 87;

        System.out.println("총점:"+total(kor, eng));
        System.out.println("평균:"+ avg(kor, eng));

    }

    public static int total(int kor, int eng) {
        int sum = kor + eng;
        return sum;
    }

    public static int avg(int kor, int eng) {
        int avg = total(kor, eng)/2;
        return avg;
    }

}
