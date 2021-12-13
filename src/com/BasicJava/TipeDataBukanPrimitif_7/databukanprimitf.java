package com.BasicJava.TipeDataBukanPrimitif_7;

public class databukanprimitf {
    public static void main(String[] args) {

        //Default nilai dari tipe data bukan primitif adalah null
         Byte inibyte = null;
        Integer iniinteger = null;
        Long inilong = null;
        Short inishort = null;

        System.out.println(inibyte);

        inibyte = 100;

        System.out.println(inibyte);

        System.out.println();

        System.out.println("Konversi tipe data ");

        int iniint1 = 100;
        Integer iniinteger2 = iniint1;
        System.out.println(iniinteger2);

        short inishort2 = iniinteger2.shortValue();
        long inilong2 = iniinteger2.longValue();
        float inifloat2 = iniinteger2.floatValue();

        System.out.println(inishort2);
        System.out.println(inilong2);
        System.out.println(inifloat2);

        Long amount = 100000L;
        int casting = amount.intValue();
        System.out.println(casting);












    }

}
