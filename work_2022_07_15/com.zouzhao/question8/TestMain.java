package question8;

public class TestMain {
    public static void main(String[] args) {
        MyClass m = new MyClass();
        int value=5;
        final int fvalue=10;
        m.printValue(value);
        m.printValue(fvalue);
      m.changeValue(value);
      m.changeValue(fvalue);
    }
}
class MyClass{
    public void printValue(final  int value){
        System.out.println(value);
    }

    public void changeValue(int value){
        value=value*2;
        System.out.println(value);
    }

}