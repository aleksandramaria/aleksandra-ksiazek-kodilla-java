package com.kodilla.testing.shape;

import java.util.ArrayList;

/**
 * Created by ola on 19/07/2017.
 */
public class ShapeCollector {
    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }
    public void removeFigure(Shape shape){
        figures.remove(shape);
    }
    public void getFigure(int n){
//        figures.get(n);

    }
    public void showFigures(){
        System.out.println(figures);
    }
}
//
//    ForumPost thePost = null;
//    if (postNumber >= 0 && postNumber < posts.size()) {
//        thePost = posts.get(postNumber);
//        }
//        return thePost;
//        }