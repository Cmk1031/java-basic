package day12.Inheritance;

class Parent {
    int field1 = 10;

    void method1() {
        System.out.println("나는 부모클래스의 method1이야");
    }
}

class Child extends Parent {
    int field2 = 20;
    /*
    Child() {
        super(); //부모클래스의 생성자를 부른다!
    }
     */
    void method2() {
        System.out.println("나는 자식클래스의 method2야");
    }
}

public class InherMain {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(parent.field1);
        parent.method1();

        System.out.println(child.field1+" "+child.field2);
        child.method1();
        child.method2();
    }
}
