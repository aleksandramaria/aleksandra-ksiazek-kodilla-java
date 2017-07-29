package com.kodilla.testing.shape;

/**
 * Created by ola on 19/07/2017.
 */
public class Triangle implements Shape {
    private String name;
    private int a;
    private int b;
    private int c;
    private int r;

    public Triangle(String name, int a, int b, int c, int r) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.r = r;
    }

    public String getShapeName() {
        return this.name;
    }

    public double getField() {
        return (a + b + c) / 2 * r;
    }
}
