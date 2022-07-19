package com.zouzhao.question4;

public class TestMain {
    public static void main(String[] args) {
        MySuper mySuper=new MySub();
        System.out.println(mySuper instanceof IA);
        System.out.println(mySuper instanceof IB);
        System.out.println(mySuper instanceof MySuper);
        System.out.println(mySuper instanceof MySub);


    }

}
interface IA{
    void ma();
}
interface IB{
    void mb();

}
 class MySuper implements IA{
    @Override
    public void ma() {

    }
}
class MySub extends MySuper implements IB{
    @Override
    public void mb() {

    }
}
