package com.kodilla.testing.com.kodilla.testing.shape;

import java.util.ArrayList;

/**
 * Created by ola on 19/07/2017.
 */
public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        figures.add(new Circle());
    }
    public boolean removeFigure(Shape shape){
        return true;
    }
    public void getFigure(int n){
    }
    public void showFigures(){
    }
}
