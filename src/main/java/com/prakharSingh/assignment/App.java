package com.prakharSingh.assignment;

import com.prakharSingh.assignment.FactoryDesign.FactoryDesign;
import com.prakharSingh.assignment.Singleton.Singleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Use of Singleton Design Pattern
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // Use of Factory Design Pattern
        FactoryDesign.getFactoryDesign("CIRCLE");
        FactoryDesign.getFactoryDesign("RECTANGLE");
        System.out.println("Added this for Git Reset.");

    }
}
