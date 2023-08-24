package com.PraktikumPAW;

public class Komentar {
    /**
     * Menghitung jumlah a + b
     * 
     * @param a parameter nilai a
     * @param b parameter nilai b
     * @return a + b
    */
    static int sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int result = sum(5, 3);

        System.out.println("Hasil Penjumlahan: " + result);
    }
}
