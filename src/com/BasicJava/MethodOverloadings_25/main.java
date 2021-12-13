package com.JavaDasar.MethodOverloadings_25;

public class main {
    public static void main(String[] args) {
        sayHello();
        sayHello("Oryza");
        sayHello("Oryza", "Valendio");

    }
    static void sayHello() {
        System.out.println("Hello");
    }
    static void sayHello(String name) {
        System.out.println("Hello" +" " +name);
    }
    static void sayHello(String firstname, String lastname) {
        System.out.println("Hello " +firstname +" " +lastname);
    }
}
