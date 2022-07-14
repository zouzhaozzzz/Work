package com.zouzhao.question15_16;

public class Rect extends Shape{
    double length;
    double width;



    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double girth() {
        return (length+width)*2;
    }
}
