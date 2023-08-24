package com.PraktikumPAW;

public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Aldi", "Raihan");
    }
    static void sayHello(String firstname, String Lastname){
        System.out.println("Hello" + " "+ firstname + " " + Lastname);
    }
}
