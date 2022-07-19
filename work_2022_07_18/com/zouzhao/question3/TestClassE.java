package com.zouzhao.question3;

public class TestClassE {
    public static void main(String[] args) {

        IC ic=new ClassE();
            ((IA) ic).ma();

            ((IB)ic).mb();

            ic.mc();

            ((ID) ic).md();
        System.out.println(ic instanceof IA);
        System.out.println(ic instanceof IB);
        System.out.println(ic instanceof IC);
        System.out.println(ic instanceof ID);
        System.out.println(ic instanceof ClassE);

    }
}
interface IA{
    void ma();
}
interface IB extends IA{
    void mb();
}
interface IC{
    void mc();
}

interface ID extends IB,IC{
    void md();

}
class ClassE implements ID{
    @Override
    public void ma() {

    }

    @Override
    public void mb() {

    }

    @Override
    public void mc() {

    }

    @Override
    public void md() {

    }
}