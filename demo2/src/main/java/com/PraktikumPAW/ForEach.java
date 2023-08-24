package com.PraktikumPAW;

public class ForEach {
    public static void main(String[] args) {
        String[] array = {
            "Aldi", "Jono", "Udin",
            "Programmer", "Zaman", "Now"
        };
        
        for(var value : array){
            System.out.println(value);
        }
    }
}
