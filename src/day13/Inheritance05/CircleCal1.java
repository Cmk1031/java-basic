package day13.Inheritance05;

public class CircleCal1 extends CircleCal{
    @Override
    public double areaCircle(double radius) {
        double result = super.areaCircle(radius);
        System.out.println("부모 버전 계산 : " + result);   // 자식메소드와 부모메소드의 공동 작업처리 기법
        // 부모 메소드를 재사용함으로써 자식 메소드의 중복 작업을 최소화 할 수 있다.
        return Math.PI * radius * radius;
    }


    public static void main(String[] args) {
        CircleCal c1 = new CircleCal();
        double result = c1.areaCircle(10);
        System.out.printf("원의 면적: %.1f", result);

        System.out.println("=====================");
        System.out.println();
        CircleCal1 c2 = new CircleCal1();
        result = c2.areaCircle(20);
        System.out.printf("원의 면적: %.1f", result);

        System.out.println("=====================");
        System.out.println();
        CircleCal c3 = new CircleCal1();
        result = c3.areaCircle(30);

        System.out.printf("원의 면적: %.1f", result);


    }
}
