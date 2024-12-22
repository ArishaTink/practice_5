package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listStrings = new ArrayList<>();
        listStrings.add("Hello");
        listStrings.add("hi");
        listStrings.add("hola");

        StringArray strings = new StringArray(listStrings);
        System.out.println(strings);

        strings.addString("i");
        strings.addString("hey");

        System.out.println(strings);

        System.out.println(strings.averageString());
    }
}