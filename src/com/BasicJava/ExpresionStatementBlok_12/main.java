package com.BasicJava.ExpresionStatementBlok_12;

import java.util.Date;

public class main { //<=Block1
    public static void main(String[] args) { //<=Block2


        int a = 10; //<=expresion
        System.out.println(a); //<=statement

        //assignment statement
        double aValue = 834.44;
        //increment statement
        aValue++;
        //method invocation statement
        System.out.println("Hello world");
        //object creation statement
        Date date = new Date();

        //Block adalah kumpulan statement yang teridir dari nol atau lebih statment

        //expresion>statement>block

        /*Blok=>*/  {
        System.out.println("Hello world1");
        System.out.println("Hello world2");
        System.out.println("Hello world3");
        {
            System.out.println("Hello world4");
            System.out.println("Hello world5");
            System.out.println("Hello world6");
            {
                System.out.println("Hello world7");
                System.out.println("Hello world8");
                System.out.println("Hello world9");
            }

        }
    }//<=Blok


    }//Block2
}//<=Block1

