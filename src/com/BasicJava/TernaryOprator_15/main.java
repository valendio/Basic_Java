package com.BasicJava.TernaryOprator_15;

public class main {
    public static void main(String[] args) {

        var nilai = 75;
        String say;
        System.out.println("===Using if else===");

        if (nilai >= 75) {
            say = "Selamat anda lulus";
        }
        else {
            say = "Silahkan coba lagi";
        }
        System.out.println(say);

        System.out.println();
        System.out.println("===using ternary===");

        String ucapan = nilai >=75 ? "Selamat anda lulus" : "Silahkan coba lagi";
        System.out.println(ucapan);

    }
}
