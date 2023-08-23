package com.PraktikumPAW;

public class Tipedataarray {
    public static void main(String[] args) {
        String[] arrayString;
        
        arrayString = new String[3];

        arrayString[0] = "Aldi";

        arrayString[1] = "Udin";

        arrayString[2] = "Jono";

        printArray(arrayString);
    }

    public static void printArray(String[] arr) {
        for (String element : arr){
            System.out.println(element);
        }
    }
}
