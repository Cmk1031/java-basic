package day12;
/*

- 왜 싱글톤 패턴을 사용할까?
-> 메모리 절약을 위해서 사용, 인스턴스가 필요할 때 똑같은 인스턴스를 새로 만들지 말고,
기존의 인스턴스를 가져와서 활용하는 기법이다.
- 언제 적용하면 좋을까?
-> 객체가 리소스를 많이 차지하는 역할, 무거운 클래스를 설계할 때 적용(DB 연결 모듈, 디스크 연결, 네트워크 통신,
DBCP 커넥션 풀, 스레드 플, 캐시, 로그 기록 객체 운영....)

- 싱글톤 패턴 구현 기법 종류
어떤 목적을 구현하기 위한 코드: 가장 최적화된 패턴을 상황에 맞게 사용하는 것이 핵심

싱글톤 패턴을 구현할 때 대표적인 코드 기법 7가지
1. Eager Initialization
   한번만 미리 만들어두는, 가장 직관적이면서도 심플한 기법(keep)
2. static block initialization
   클래스가 로딩되고 클래스 변수가 준비된 후 자동으로 실행되는 블럭
3. Lazy initialization
   객체 생성에 대한 관리를 내부적으로 처리
   메서드를 호출했을 때 인스턴스 변수의 null 유무에 따라 초기화 하거나 있는 걸 반환하는 기법
   Thread Safe하지 않다는 단점이 있다.
4. Thread safe initialization
5. Double-Checked Locking
6. Bill Pugh Solution
   멀티쓰레드 환경에서 안전하고 Lazy Loading(나중에 객체 생성)
   클래스 안에 내부 클래스 두어서
7. Enum 이용

- 싱글톤의 문제점
1. 모듈간의 의존성이 높아진다.
2. SOLID 원칙: 객체지향 프로그래밍이 지향하는 원칙
3. TDD(테스트 주도 개발)

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
