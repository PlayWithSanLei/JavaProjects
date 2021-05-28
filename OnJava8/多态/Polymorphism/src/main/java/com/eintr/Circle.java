package com.eintr;

public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Draw a Circle");
    }

    @Override
    public void erase() {
        System.out.println("Erase a Circle");
    }
}
