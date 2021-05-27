package com.eintr;

class Instrument {
    public void play() {
        System.out.println("BalaBala");
    }

    static void tune(Instrument i) {
        i.play();
    }
}

public class Wind extends Instrument {
// 你好
// 以后我就这样写注释了
    @Override
    public void play() {
        System.out.println("LaLaLa...");
    }

    public static void main(String[] args) {
        Instrument.tune(new Wind());
    }
}
