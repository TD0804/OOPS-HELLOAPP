package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloApp {

    public static void main(String[] args) {

        String names;

        if (args.length == 0) {
            names = "World";
        } else {
            names = String.join(", ", args);
        }

        System.out.println("Hello, " + names + "!");
    }
}