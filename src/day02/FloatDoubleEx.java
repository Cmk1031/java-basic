package day02;

public class FloatDoubleEx {
    public static void main(String[] args) {
        double x = 0.25;
        double y = - 3.14;

        double z = 5e2; // 5.0 X 10^2 = 500
        System.out.println(z);

        double k = 0.12E-2; //0.12 X 10^-2
        System.out.println(k);
        /*컴파일러는 실수 리터럴을 기본적으로 double 타입으로 해석하기 때문에
        double 타입변수에 대입하는 것이 기본이다. */

        float o = 3.14f;
        //f는 float을 나타내기 위해 사용함.

    }
}
