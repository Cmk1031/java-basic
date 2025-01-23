package day12;

//싱글톤 패턴
public class Singleton {
    private static Singleton singleton = new Singleton();

    //private 접근 권한을 갖는 생성자 선언: 외부 객체 생성 불가
    private Singleton(){};

    public static Singleton getInstance() {
        return singleton;
    }
}
