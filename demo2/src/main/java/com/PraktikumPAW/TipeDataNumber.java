package com.PraktikumPAW;

public class TipeDataNumber {
    byte iniByte = 12;
    short iniShort_Konversi = iniByte;

    short iniShort = 32_767;
    int iniInt = 2_147_483_647;
    long iniLong = 923_337_203;

    float iniFloat = 10.12F;
    long iniLong2 = (long) iniFloat;

    double iniDouble = 12.2424;

    int decimalInt = 25;
    int hexInt = 0xABCDEF;
    int binInt = 0b1010101010101;

    // Method untuk menampilkan nilai nilai dari variabel diatas
    public void displayValues(){
        System.out.println("iniByte: " + iniByte);
        System.out.println("iniShort_Konversi: " + iniShort_Konversi);
        System.out.println("iniShort: " + iniShort);
        System.out.println("iniInt: " + iniInt);
        System.out.println("iniLong: " + iniLong);
        System.out.println("iniFloat: " + iniFloat);
        System.out.println("iniLong2: " + iniLong2);
        System.out.println("iniDouble: " + iniDouble);
        System.out.println("decimalInt: " + decimalInt);
        System.out.println("hexInt: " + hexInt);
        System.out.println("binInt: " + binInt);
    }

    public static void main(String[] args) {
        TipeDataNumber data = new TipeDataNumber();
        data.displayValues();
    }
}
