package day12;

public class SingletonStatic {
    private static SingletonStatic instance;

    private SingletonStatic() {
    }

    //static 블럭을 이용해 예외 처리
    static {
        try {
            instance = new SingletonStatic();
        } catch (Exception e) {
            throw new RuntimeException("싱글톤 객체 생성 오류");
        }
    }

    //Lazy
    public static SingletonStatic getInstance() {
        return instance;
    }
}
