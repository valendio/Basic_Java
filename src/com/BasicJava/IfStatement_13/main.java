package com.BasicJava.IfStatement_13;

public class main {
    public static void main(String[] args) {

        var absen = 40;
        var nilai = 90;

        if (absen>=75 && nilai>=75) {
            System.out.println("Selamat anda lulus");
        }
        else {
            System.out.println("Maaf anda tidak lulus");
        }

        if (absen >=80 && nilai>=80) {
            System.out.println("Nilai anda A");
        }
        else if (absen >=70 && nilai>=70) {
            System.out.println("Nilai anda B");
        }
        else if (absen >=60 && nilai>=60) {
            System.out.println("Nilai anda C");
        }
        else if (absen >=50 && nilai>=50) {
            System.out.println("Nilai anda D");
        }
        else {
            System.out.println("Nilai anda E");
        }



    }

}
