/**
 * @author : eintr
 * @created : 2021-05-25
**/
package com.eintr.dessert;

public class Cookie {
  private int a;
  public int b;
  protected int c;

  {
    a = 1;
    b = 2;
    c = 3;
  }
  public Cookie() {
    System.out.println("Cookie constructor");
  }

  void f() {
    System.out.println("f()");
  }

  public void f(int i) {
    System.out.printf("f(i+a) = %d\n", i+a);
  }
}
