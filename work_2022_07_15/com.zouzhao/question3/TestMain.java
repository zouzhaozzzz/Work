package question3;

public class TestMain {
    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        MyClass mc2 = new MyClass();
        MyClass mc3 = new MyClass();
    }
}
class MyClass{
    static int count =0;
    public MyClass(){
        count++;
        System.out.println(count);
    }
}
