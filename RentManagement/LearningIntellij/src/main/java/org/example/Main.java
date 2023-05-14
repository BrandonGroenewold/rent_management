package org.example;

import org.example.model.Product;

public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello World";
        System.out.println("Hello world!");

        Product product = new Product( "Keyboard");

        System.out.println(product.getName());
    }
}