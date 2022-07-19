package com.zouzhao;

public class Mobile  extends Phone implements Wifi{
    @Override
    public void connect() {
        System.out.println("connect");
    }


    public void dial(){
        System.out.println("dial");
    }

    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.connect();

        Phone p=new Mobile();
        p.dial();

        Wifi w=new Mobile();
        w.connect();

    }
}
