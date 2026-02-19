package com.practice;

public class Laptop implements Computer {

//    public Laptop(){
//        System.out.println("Laptop Object is Created.");
//    }
    @Override
    public void compile(){
        System.out.println("Compiling Using Laptop...");
    }
}
