package question9;

public class TestFinal {
    public static void main(String[] args) {
        final MyClass m = new MyClass();
        m.value=10;
        m.value=200;
        //m =new MyClass();
        System.out.println(m.value);
    }
}
class MyClass{
    int value;
}