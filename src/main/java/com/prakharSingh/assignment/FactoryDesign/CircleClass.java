package com.prakharSingh.assignment.FactoryDesign;

public class CircleClass implements ShapeClass{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
