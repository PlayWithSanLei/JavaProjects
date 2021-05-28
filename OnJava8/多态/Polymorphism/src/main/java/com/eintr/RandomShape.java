package com.eintr;

import java.util.*;

public class RandomShape {
    private Random rand = new Random(47);

    public Shape get() {
        switch (rand.nextInt(2)) {
        default:
        case 0:
            return new Circle();
        case 1:
            return new Square();
        }
    }

    public Shape[] array(int sz) {
        // Fill up the array with shapes:
        Shape[] shapes = new Shape[sz];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = get();
        }

        return shapes;
    }
}
