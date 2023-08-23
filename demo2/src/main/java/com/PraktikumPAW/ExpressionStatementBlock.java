package com.PraktikumPAW;

import java.util.Date;

public class ExpressionStatementBlock {
    public static void main(String[] args) {
        int value;
        value = 10;
        System.out.println(value = 100);

        // pernyataan assignment
        double aValue = 8933.234;
        // pernyataan penambahan
        aValue++;
        System.out.println(aValue);
        // pernyataan pemanggilan metode
        System.out.println("Hello World");
        // pernyataan pembuatan objek
        Date date = new Date();
        System.out.println(date);
    }    
}

class ExpressionApp {
    public static void main(String[] args) {
        double aValue = 9213.21;
        aValue++;
        System.out.println(aValue);
        System.out.println("Hello World");
    }
}
