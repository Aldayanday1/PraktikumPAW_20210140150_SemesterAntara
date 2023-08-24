package com.PraktikumPAW;

public class MethodOverloading {
    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String firstname){
        System.out.println("Hello " + firstname);
    }

    static void sayHello(String firstname, String Lastname){
        System.out.println("Hello " + firstname + " " + Lastname);
    }

    public static void main(String[] args) {
        sayHello();
        sayHello("Aldi");
        sayHello("Aldi", "Raihan");
    }
}
