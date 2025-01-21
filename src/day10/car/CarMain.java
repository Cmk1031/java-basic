package day10.car;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("테슬라", "최문규",0);
        for(int i=0; i<10; i++) {
            car1.speedUp();
        }
        for(int i=0; i<10; i++) {
            car1.speedDown();
        }

    }
}
