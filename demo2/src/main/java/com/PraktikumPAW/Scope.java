package com.PraktikumPAW;

public class Scope {
    static void sayHello(String name){
        String hello = "Hello" + name;
        String hi = "";

        if (!name.isBlank()){
            hi = "Hi " + name;

            System.out.println(hi);
        }

        System.out.println(hello);
        System.out.println(hi);
    }

    public static void main(String[] args) {
        sayHello(" Aldi");
    }
}
