package day13.Inheritance02;

public class Main {
    public static void main(String[] args) {
        //Phone 타입으로 유선전화 생성
        //1. 전화건다
        //2. 전화 받기
        //3. 메세지 전송
        //4. 메세지 수신
        //5. 전화 끊기
        Phone phone = new Phone();
        phone.bell();
        phone.hangOn();
        phone.sendVoice("안녕!");
        phone.receiveVoice();
        phone.hangOut();

        //스마트폰
        //0. wifi를 연결하고 인터넷 켠다
        //1. 전화를 건다
        //2. 전화를 받는다
        //3. 메세지 전송
        //4. 메세지 수신
        //5. 전화 끊기
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setWifi(true);
        smartPhone.internet();
        smartPhone.bell();
        smartPhone.hangOn();
        smartPhone.sendVoice("안녕!안녕!");
        smartPhone.receiveVoice();
        smartPhone.hangOut();

        //bander: 사과, model: 사과15PRo, color: 화이트 SmartPhone 생성하여
        //0. wifi를 연결하고 인터넷 켠다
        //1. 전화를 건다
        //2. 전화를 받는다
        //3. 메세지 전송
        //4. 메세지 수신
        //5. 전화 끊기

        SmartPhone applePhone = new SmartPhone("사과", "사과15Pro", "화이트");
        applePhone.setWifi(true);
        applePhone.internet();
        smartPhone.bell();
        smartPhone.hangOn();
        smartPhone.sendVoice("안녕!안녕!");
        smartPhone.receiveVoice();
        smartPhone.hangOut();
    }
}
