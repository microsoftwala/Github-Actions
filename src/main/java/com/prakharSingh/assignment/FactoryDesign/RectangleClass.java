package com.prakharSingh.assignment.FactoryDesign;

public class RectangleClass implements ShapeClass{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
