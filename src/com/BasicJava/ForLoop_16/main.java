package com.BasicJava.ForLoop_16;

public class main {
    public static void main(String[] args) {

        var counter = 1;

        for (; counter<=10;) {
            System.out.println("Loop ke : " +counter);
            counter++;
        };
        System.out.println();

        System.out.println("===dengan init statement===");
        for (counter = 1; counter<=10;){
            System.out.println("Loop ke : " +counter);
            counter++;
        };

        System.out.println();

        System.out.println("===dengan post statement===");
        for (counter = 1; counter <=10; counter++) {
            System.out.println("Loop ke : " +counter);
        };



    }
}
