package com.BasicJava.TipeDataArray_8;

public class dataArray {

    public static void main(String[] args) {

        String [] stringarray;
        stringarray = new String[3];

        stringarray[0] = "Oryza";
        stringarray[1] = "Valendio";
        stringarray[2] = "Ganteng";

        System.out.println(stringarray[0]);
        System.out.println(stringarray[1]);
        System.out.println(stringarray[2]);

        stringarray[2] = "Tampan";
        System.out.println(stringarray[2]);

        System.out.println(stringarray[0]+" "+stringarray[1]+" "+stringarray[2]);

        System.out.println();

        System.out.println("===array initializer===");

        int [] arrayint = new int[] {
          1,2,3,4,5,6,7,8,9
        };
        long [] arraylong = {
          10L, 20L, 30L, 40L
        };

        System.out.println(arrayint[1]);
        System.out.println(arraylong[1]);

        System.out.println();

        System.out.println("Mengosongkan nilai array");

        arrayint[0] = 0;
        System.out.println(arrayint[0]);

        arraylong[2] = 0;
        System.out.println(arraylong[2]);

        stringarray[1] = null;
        System.out.println(stringarray[1]);

        System.out.println();

        System.out.println("===array dalam array===");

        String[][] members = {
                {"Oryza", "Valendio"},
                {"Rara", "Zalfa"},
                {"Miko", "Ibnu"}
        };

        System.out.println(members[0][0] +" " +members[0][1]);




    }
}
