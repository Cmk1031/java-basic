package day13.Inheritance05;

public class Computer extends Calculator{

    private double radius;

    public Computer(){}

    public Computer(double radius) {
        this.radius = radius;
    }

    public Computer(int low, int column) {

    }

    @Override
    public void areaCompute() {
        System.out.println("원의 면적을 계산하는 기능을 수행합니다.");
        double result = Math.PI * radius * radius;
        System.out.printf("계산이 끝났습니다. 면적은 %.1f", result);
    }

    public static void main(String[] args) {
        //사각형의 면적

        Calculator calculator1 = new Calculator(10,20);
        calculator1.areaCompute();

        //원의 면적
        Computer computer2 = new Computer(5.0);
        computer2.areaCompute();

        System.out.println();

        Calculator calculator = new Computer(10,20);
        calculator.areaCompute();

    }
}
