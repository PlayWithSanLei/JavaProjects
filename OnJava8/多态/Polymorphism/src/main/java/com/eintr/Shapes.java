package com.eintr;

public class Shapes
{
    public static void main(String[] args) {
        RandomShape r = new RandomShape();

        for (Shape shape :r.array(10)){
            shape.draw();
        }
    }

}
