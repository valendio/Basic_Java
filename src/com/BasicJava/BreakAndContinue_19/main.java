package com.JavaDasar.BreakAndContinue_19;

public class main {
    public static void main(String[] args) {

        System.out.println("===Break===");

        var num = 1;

        while (true) {
            System.out.println("Loop : " +num);
            num++;

            if(num >10)
                break;
        }

        System.out.println();

        System.out.println("===Continue===");
        for (var a=1; a<=100; a++) { //<==Melakukan perulangan 1-100

            if (a%2 == 0) //<==Menampilkan angka Ganjil
                continue;

            System.out.println("Loop : " +a);

        }

    }
}
