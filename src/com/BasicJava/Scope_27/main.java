package com.JavaDasar.Scope_27;

public class main {
    public static void main(String[] args) {
        sayHello("Oryza");

    }
    static void sayHello (String name) {
        String hello = "Hello " +name;

        if (!name.isBlank()) { //<<= Scope
            String hi = "Hi " +name;
            System.out.println(hi);
        }//<<=Scope
        System.out.println(hello);
    }
}
