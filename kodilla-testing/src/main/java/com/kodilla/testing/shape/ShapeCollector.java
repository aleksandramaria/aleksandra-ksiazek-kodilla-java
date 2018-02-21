package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ola on 19/07/2017.
 */
public class ShapeCollector {
    private List<Shape> figures = new ArrayList<Shape>();

    public boolean addFigure(Shape shape) {
        return figures.add(shape);
    }
    public boolean removeFigure(Shape shape){
        return figures.remove(shape);
    }
    public Shape getFigure(int n){
       return figures.get(n);
    }
    public String showFigures(){
        String result = "";
        for(Shape shape : figures) {
            result = result + shape.toString();
        }
        return result;
    }
}