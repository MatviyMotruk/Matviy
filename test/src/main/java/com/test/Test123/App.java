package com.test.Test123;

public class App {
    public static void main(String[] args) {
        EMPTY Laptop = new EMPTY();
        Laptop.setModel("Lenovo");
        Laptop.setPrice(1000);

        System.out.println(Laptop.getModel());
        System.out.println(Laptop.getPrice());

    }
}
