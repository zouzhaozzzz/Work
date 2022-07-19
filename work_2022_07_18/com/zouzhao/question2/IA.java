package com.zouzhao.question2;

public interface IA {
    void m1();
    void m2();
}
abstract class MyClassA implements IA{
    @Override
    public void m1() {

    }

}
class  Mw extends MyClassA{

    @Override
    public void m2() {

    }
    public void m1() {

    }

}