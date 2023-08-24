package com.PraktikumPAW;

public class RecrusiveMethod {
    static int factorialRecrusive(int value){
        if (value == 1){
            return 1;
        } else {
            return value * factorialRecrusive(value - 1);
        }
    }

    public static void main(String[] args) {
        int nomor = 4; //4 * 3 * 2 * 1
        int hasil = factorialRecrusive(nomor);
        System.out.println("Factorial Recrusive dari " + nomor + " adalah: " + hasil);
    }
}
