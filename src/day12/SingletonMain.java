package day12;
/*
- 왜 싱글톤 패턴을 사용할까?
-> 메모리 절약을 위해서 사용, 인스턴스가 필요할 때 똑같은 인스턴스를 새로 만들지 말고,
기존의 인스턴스를 가져와서 활용하는 기법이다.
- 언제 적용하면 좋을까?
-> 객체가 리소스를 많이 차지하는 역할, 무거운 클래스를 설계할 때 적용(DB 연결 모듈, 디스크 연결, 네트워크 통신,
DBCP 커넥션 풀, 스레드 플, 캐시, 로그 기록 객체 운영....)
 */
class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

}


public class SingletonMain {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1==obj2);

        if(obj1==obj2) {
            System.out.println("같은 객체 참조" + obj1.toString() + " "+ obj2);
        } else {
            System.out.println("다른 객체이다.");
        }


    }
}
