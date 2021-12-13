package com.BasicJava.SwitchCase_14;

public class main {
    public static void main(String[] args) {

        String nilai = "B";
        System.out.println("Dengan cara konvensional");

        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda lulus dengan sangat baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus dengan nilai lumayan");
                break;
            case "D":
                System.out.println("Maaf anda tidak lulus");
                break;
            default:
                System.out.println("Sepertinya anda salah jurusan");
        }


                System.out.println();

                System.out.println("Menggunakan lambda (->)");

                switch (nilai) {
                    case "A" -> System.out.println("wow, anda lulus dengan nilai sangat baik");
                    case "B", "C" -> System.out.println("Anda lulus dengan nilai lumayan");
                    case "D" -> System.out.println("Maaf anda tidak lulus");
                    default -> {
                        System.out.println("Mungkin anda salah jurusan");
                    }
                }

        System.out.println();

        System.out.println("Menggunakan lambda (->) tanpa yield");
        String ucapan;
        switch (nilai) {
            case "A" -> ucapan = ("wow, anda lulus dengan nilai sangat baik");
            case "B", "C" -> ucapan = ("Anda lulus dengan nilai lumayan");
            case "D" -> ucapan = ("Maaf anda tidak lulus");
            default -> {
                ucapan = ("Mungkin anda salah jurusan");
            }
        }

        {
            System.out.println(ucapan);
            }

        System.out.println();

        System.out.println("Menggunakan lambda (->) dengan yield");
         ucapan = switch (nilai) {
             case "A" : yield ("wow, anda lulus dengan nilai sangat baik");
             case "B", "C" : yield ("Anda lulus dengan nilai lumayan");
             case "D" : yield ("Maaf anda tidak lulus");
             default : yield ("Mungkin anda salah jurusan");
            };
        System.out.println(ucapan);

        }


}
