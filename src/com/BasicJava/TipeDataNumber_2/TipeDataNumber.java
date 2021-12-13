//7/12/2021
package com.BasicJava.TipeDataNumber_2;

public class TipeDataNumber {
    public static void main(String[] args) {

        System.out.println("===Integer Number===");

        byte inibyte = 100;
        short inishort = 1000;
        int iniint = 100000;
        long inilong = 10000000;
        long inilong2 = 100000000L;


        System.out.println("Byte  : " +inibyte);
        System.out.println("Short : " +inishort);
        System.out.println("Int   : " +iniint);
        System.out.println("Long  : " +inilong);
        System.out.println("Long  : " +inilong2);

        System.out.println();

        System.out.println("===Floating Point Nummber===");

        Float inifloat = 10.10F;
        double inidouble = 10.10;

        System.out.println("Float : " +inifloat);
        System.out.println("DOuble : " +inidouble);

        System.out.println();

        System.out.println("===Literals Number===");

        int decimal = 25;
        int hexadecimal = 0xA132B; //Penulisan Hexadesimal harus diawali dengan  (0x)
        int binary = 0b01010101; //Penulisan Binary harus diawali dengan (0b)

        System.out.println("Decimal : " +decimal);
        System.out.println("hexadecimal : " +hexadecimal);
        System.out.println("Binary : " +binary);

        System.out.println();

        System.out.println("===Underscore===");

        long amount = 1_000_000_000_000L; //Under score digunakan untuk memudahkan pembacaan pada angka nol (bebas diataruh mana)
        int sum = 6_000_000;

        System.out.println( "Long w/us : "+amount);
        System.out.println("Int w/us : " +sum);

        System.out.println();

        System.out.println("===Konversi tipe data number===");

        //Widening casting (Automatis) => dari (Byte=>Short=>Int=>Long=>Float=>Double)
        //Narrowing casting (manual) => dari (Double=>Float=>Long=>Int=>Short=>Byte)






    }
}
