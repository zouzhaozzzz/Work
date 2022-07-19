package com.zouzhao.question10;

public class TestLamp {
    public static void main(String[] args) {
        Lamp lamp=new Lamp();
        class shineRed implements Light{

            @Override
            public void shine() {
                System.out.println("shine in red");
            }
        }
        lamp.on(new shineRed());

        Light light=new Light() {
            @Override
            public void shine() {
                System.out.println("shine in yellow");
            }
        };
        light.shine();
    }
}
interface Light{
    void shine();
}
class  Lamp{
    public void on(Light light){
        light.shine();
    }
}