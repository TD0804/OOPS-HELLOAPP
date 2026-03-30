package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloApp {

    public static void main(String[] args) {

        String names;

        if (args.length > 0) {

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                builder.append(args[i]);

                if (i < args.length - 1) {
                    builder.append(", ");
                }
            }

            names = builder.toString();

        } else {
            names = "World";
        }

        System.out.println("Hello, " + names + "!");
    }
}