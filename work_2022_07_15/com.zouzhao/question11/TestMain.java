package question11;

public class TestMain {

}
abstract class MyAb{
    public abstract void m1();
    abstract protected void m2();

    public static  final void m(){}
}
class MySub extends MyAb{

    @Override
    public void m1() {

    }

    @Override
    protected void m2() {

    }
}