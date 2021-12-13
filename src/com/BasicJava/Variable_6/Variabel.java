package com.BasicJava.Variable_6;


public class Variabel {
    public static void main(String[] args) {

        String name;
        name = "Oryza Valendio";

        System.out.println(name);

        int umur;
        umur = 16;

        String negara;
        negara = "Indonesia";

        System.out.println(umur);
        System.out.println(negara);

        name = "rara";
        System.out.println(name);

        System.out.println();

        System.out.println("Menggunakan var");

        //Kata kunci var

        var firstName = "Oryza";
        var lastName = "Valendio";

        System.out.println(firstName +" " +lastName);

        System.out.println();

        System.out.println("Menggunakan Final");
        //final digunakan untuk memutlakkan nilai/nilai tidak bisa diubah

        final String application = "belajar dasar java";
        System.out.println(application);



    }
}
