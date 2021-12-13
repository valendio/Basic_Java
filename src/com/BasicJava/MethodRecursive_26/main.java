package com.JavaDasar.MethodRecursive_26;

public class main {
    public static void main(String[] args) {

        System.out.println("Dengan Factorial looping");
        System.out.println(factorialLoop(5));

        System.out.println();
        System.out.println("Dengan Factorial Recursive");
        System.out.println(factorialRecirsive(5));

    }

      static int factorialLoop (int value){
        var result = 1;

        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }
    static int factorialRecirsive(int value) {
        if (value==1) {
            return 1;
        }else {
            return value*factorialRecirsive(value-1);

        }
    }

}
