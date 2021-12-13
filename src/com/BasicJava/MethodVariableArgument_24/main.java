package com.JavaDasar.MethodVariableArgument_24;

public class main {
    public static void main(String[] args) {

        { //<== Using array
            int[] values = {
                    80, 77, 75, 90
            };

            sayCongrats("Oryza", values);
        }

      sayCongrats("Oryza", 90,55,88,58,98); //<<= Using argument

    }


    static void sayCongrats (String name, int... values) { //<== Using argument
    //static void sayCongrats (String name, int[] values) <== Using array
        { var total = 0; //<<= The method still not changes
        for (var value : values) {
            total += value;

        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " +name +" Anda lulus");
        }else {
            System.out.println("Maaf " + name + " Anda tidak lulus");
        }
        }
    }
}
