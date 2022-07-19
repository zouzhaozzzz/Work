package com.zouzhao.question10;

public class MyService implements ServiceInterface{

    @Override
    public void doService1() {

    }

    @Override
    public void doService2() {

    }

    @Override
    public void doService3() {

    }
}
class MyService2 extends AbstractService{

    @Override
    public void doService1() {

    }

    @Override
    public void doService11() {

    }

}

interface  ServiceInterface{
    void doService1();
    void doService2();
    void doService3();
}
abstract class AbstractService implements ServiceInterface{
    public abstract void doService1();
    public abstract void doService11();
    public void doService2(){}
    public void doService3(){}
    public void m(){}
}