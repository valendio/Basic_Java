package com.BasicJava.OperatorMatematika_9;

public class main {
    public static void main(String[] args) {

        //Operator (+, -, *, /, %)

        int a = 100;
        int b = 10;

        System.out.println("a = " +a);
        System.out.println("b = " +b);


        System.out.println();

        System.out.println("Penjumlahan a+b " +(a+b));
        System.out.println("Pengurangan a-b "+(a-b));
        System.out.println("Pembagian a/b "+(a/b));
        System.out.println("Perkalian a*b "+(a*b));
        System.out.println("Modulus a%b "+(a%b));

        System.out.println();

        System.out.println("===Augmented asignment===");

        int c=100;
        System.out.println("Nilai c = " +c);

        c += 10;
        System.out.println("nilai c = " +c);

        c -= 10;
        System.out.println("nilai c = " +c);

        c *= 10;
        System.out.println("nilai c = " +c);

        System.out.println();

        System.out.println("===Operator unary===");

        int  d=100;

        System.out.println("Nilai d = "+d);

        d++;
        System.out.println("d++ = "+d);

        d--;
        System.out.println("d-- = " +d);

    }
}
