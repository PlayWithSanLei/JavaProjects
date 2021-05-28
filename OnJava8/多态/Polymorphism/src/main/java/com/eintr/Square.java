package com.eintr;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw a Square");
    }

    @Override
    public void erase() {
        System.out.println("Erase a Square");
    }
}
