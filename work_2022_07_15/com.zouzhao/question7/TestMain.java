package question7;

public class TestMain {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
    }
}
class MyClass{
 final int value=10;

    public MyClass(){

    }
    public MyClass(int value){
        value=10;
    }
}