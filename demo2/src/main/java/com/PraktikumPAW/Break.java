package com.PraktikumPAW;

public class Break {
    public static void main(String[] args) {
        var counter = 5;

        while (true){
            System.out.println("Perulangan Ke " + counter);
            counter++;
            if (counter > 10){
                break;
            }
        }
    }
}
