package com.JavaDasar.ForEach_20;

public class main {
    public static void main(String[] args) {

        System.out.println("===Using For===");

        String[] names = {
            "Oryza", "Valendio",
            "Learning", "Programming"
        };
        for (var a=0; a<names.length; a++) {
            System.out.println(names[a]);
        }


        System.out.println();
        System.out.println("===For Each===");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
