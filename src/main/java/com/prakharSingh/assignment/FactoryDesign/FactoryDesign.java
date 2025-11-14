package com.prakharSingh.assignment.FactoryDesign;

public class FactoryDesign {

    public static void getFactoryDesign(String shapeType){
        ShapeClass shape = null;
        if(shapeType == null){
            System.out.println("Shape type is null");
            return;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            shape = new CircleClass();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            shape = new RectangleClass();
        } else {
            System.out.println("Unknown shape type");
            return;
        }
        shape.draw();
    }
}
