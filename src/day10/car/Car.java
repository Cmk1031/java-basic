package day10.car;

public class Car {
    private String model;
    private String owner;
    private int speed;

    public Car(String model, String owner, int speed) {
        this.model = model;
        this.owner = owner;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void speedUp() {
        this.speed++;
        System.out.println("Speed Up!");
        System.out.println("현재 스피드는 "+speed+"입니다");
    }

    public void speedDown() {
        this.speed--;
        if(speed<=0) {
            System.out.println("stop!");
            speed = 0;
        } else {
            System.out.println("Speed Down!");
            System.out.println("현재 스피드는 "+speed+"입니다");
        }
    }
}
