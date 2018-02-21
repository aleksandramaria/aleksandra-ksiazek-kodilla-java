package com.kodilla.testing.shape;

/**
 * Created by ola on 19/07/2017.
 */
public class Square implements Shape {
    private String name;
    private int a;

    public Square(String name, int a) {
        this.name = name;
        this.a = a;
    }

    public String getShapeName() {
        return this.name;
    }

    public double getField() {
        return a * a;
    }

    @Override
    public String toString() {
        return name;
    }
}
