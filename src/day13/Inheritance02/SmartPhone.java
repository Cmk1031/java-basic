package day13.Inheritance02;

public class SmartPhone extends Phone {
    //wifi 기능 추가
    private boolean wifi;

    public SmartPhone() {}


    public SmartPhone(String bander, String model, String color) {
        super(bander, model, color);
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("wifi의 상태를 변경하였습니다.");
    }

    public void internet(){
        System.out.println("인터넷에 연결합니다.");
    }
}
