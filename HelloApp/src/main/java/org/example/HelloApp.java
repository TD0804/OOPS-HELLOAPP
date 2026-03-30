package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class HelloApp {

    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();

        // Check if no arguments
        if (args.length == 0) {
            names.append("World");
        } else {

            boolean first = true;

            // enhanced for loop
            for (String name : args) {

                if (!first) {
                    names.append(", ");
                }

                names.append(name);
                first = false;
            }
        }

        System.out.println("Hello, " + names + "!");
    }
}