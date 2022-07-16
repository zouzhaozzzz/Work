package question1;

public class TestMain {
    public static void main(String[] args) {
        MyClass m1 = new MyClass();
        MyClass m2 = new MyClass();
        m1.a=100;
        m1.b=200;
        m2.a=300;
        m2.b=400;
        System.out.println(m1.a);
        System.out.println(m1.b);
        System.out.println(m2.a);
        System.out.println(m2.b);
    }
}
class MyClass{
    static int a;
    int b;
}