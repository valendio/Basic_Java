package com.JavaDasar.MethodReturn_23;

public class main {
    public static void main(String[] args) {

        System.out.println(sum(4, 4));

        System.out.println(angka(1, "+", 5));


    }
    static int sum (int value1, int value2) {
        var total = value1 + value2;
        return total;
    }
    static int angka (int value1, String operasi, int value2) {
        switch (operasi) {
            case "+" :
                return value1 + value2;
            case "-" :
                return value1 - value2;
            default:
                return 0;
        }
    }
}
