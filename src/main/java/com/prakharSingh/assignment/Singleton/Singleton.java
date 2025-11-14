package com.prakharSingh.assignment.Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
        // private constructor to prevent instantiation
    }

    public synchronized static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }


}
