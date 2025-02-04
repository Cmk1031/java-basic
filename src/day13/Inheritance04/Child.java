package day13.Inheritance04;

public class Child extends Parent {
    int number;

    public static void main(String[] args) {
        Parent p = new Parent();
        Child child = new Child();

        System.out.println(p.name+p.age);
        System.out.println(child.number+child.name+child.age);

        //업캐스팅: 자식에서 부모로
        Parent p1 = child;
        System.out.println(p1.age + p1.name);

        //다운캐스팅: 부모에서 자식으로
        Child c1 = (Child)p1;
        System.out.println(c1.age+c1.name+c1.number);
    }
}
