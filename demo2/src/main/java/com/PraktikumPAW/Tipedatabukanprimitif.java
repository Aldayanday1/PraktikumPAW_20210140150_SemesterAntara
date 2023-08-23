package com.PraktikumPAW;

public class Tipedatabukanprimitif {
    public static void main(String[] args) {
        Integer iniInteger = 50;
        Long iniLong = 10L;
        Boolean iniBoolean = true;
        Short iniShort = 100;

        long total = totalkalkulasi(iniInteger, iniLong, iniBoolean, iniShort);

        System.out.println("Hasil penjumlahan: " + total);
        
    }

    public static long totalkalkulasi(Integer intValue, long longValue, Boolean boolValue, Short shortValue){
        return intValue + longValue + (boolValue ? 1 : 0) + shortValue;
    }
}
