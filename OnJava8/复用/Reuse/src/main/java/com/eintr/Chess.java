package com.eintr;

class Game {
    Game(int i) {
        System.out.printf("Game(%d)\n", i);
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.printf("BoardGame(%d)\n", i);
    }
}

public class Chess extends BoardGame {
    Chess(int i) {
        super(i);
        System.out.printf("Chess(%d)\n", i);
    }

    public static void main(String[] Args) {
        Chess c = new Chess(11);
    }

}
