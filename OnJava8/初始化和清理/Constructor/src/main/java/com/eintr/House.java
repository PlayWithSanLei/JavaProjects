/**
 * @author : eintr
 * @created : 2021-05-24
**/
package com.eintr;

public class House {
  static Window w1 = new Window(1);

  House() {
    System.out.println("init House");
    Window w3 = new Window(33);
  }

  static Window w2 = new Window(2); 
  void f() {
    System.out.println("f()");
  }

  Window w3 = new Window(3);
}

class Window {
  Window(int marker) {
    System.out.println(marker);
  }
}
