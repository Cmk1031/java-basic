package day13.Inheritance05;

public class Calculator {

    private int row;
    private int column;

    public Calculator() {
    }

    public Calculator(int low, int column) {
        this.row = low;
        this.column = column;
    }

    public void areaCompute() {
        System.out.println("사각형 면적을 계산!");
        int result = row*column;
        System.out.println("계산이 끝났습니다. 면적은"+ result);
    }
}
