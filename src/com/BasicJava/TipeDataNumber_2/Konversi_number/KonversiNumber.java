package com.BasicJava.TipeDataNumber_2.Konversi_number;

public class KonversiNumber {
    public static void main(String[] args) {

        System.out.println("===Konversi tipe data number===");

        //Widening casting (Automatis) => dari (Byte=>Short=>Int=>Long=>Float=>Double)
        //Narrowing casting (manual) => dari (Double=>Float=>Long=>Int=>Short=>Byte)

        byte inibyte = 10;
        short inishort = inibyte;
        int iniint = inishort;

        System.out.println("Dari Byte ke Int (10): "+iniint);

        System.out.println();

        int iniint2 = 1000;
        byte inibyte2 = (byte) iniint2;
        System.out.println("Dari int ke Byte (1000):"+inibyte2);





    }
}
