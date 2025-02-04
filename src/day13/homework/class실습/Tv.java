package day13.homework.class실습;

public class Tv {
    //멤버 변수
    private String color;
    private boolean power;
    private int channel;

    //생성자 초기화
    public Tv() {
        this.color = "black";
        this.power = false;
        this.channel = 0;

    }

    //메서드
    public void power() {
        if(power) {
            power = false;
        } else {
            power = true;
        }
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }

    public void print() {
        System.out.println("color :"+color+ "\tpower:"+power+"\tchannel:"+channel);
    }

}
