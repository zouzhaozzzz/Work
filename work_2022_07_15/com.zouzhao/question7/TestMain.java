package question7;

public class TestMain {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        System.out.println(myClass.value);
    }
}
class MyClass{
 final int value;

    public MyClass(){
        value=10;
    }
    public MyClass(int value){
        this.value=value;
    }
}