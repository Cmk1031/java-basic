package day12;

public class SingletonHolder {
    private SingletonHolder(){}
    //내부 클래스 안에서 new
    private static class SingleInstanceHolder{
        private static final SingletonHolder INSTANCE = new SingletonHolder();
    }
    public static SingletonHolder getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }
}
