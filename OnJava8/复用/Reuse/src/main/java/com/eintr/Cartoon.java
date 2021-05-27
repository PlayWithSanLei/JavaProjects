package com.eintr;

class Art {
    Art() {
        System.out.println("Art()");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing()");
    }
}

public class Cartoon extends Drawing {
    Cartoon() {
        System.out.println("Cartoon()");
    }

    public static void main(String Args[]) {
        Cartoon c = new Cartoon();
    }
}
