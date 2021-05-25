/**
 * @author : eintr
 * @created : 2021-05-25
**/
package com.eintr.food;

import com.eintr.dessert.Cookie;

public class Cake extends Cookie {
  public Cake() {
    // a = 4; 无法访问
    b = 4;
    c = 5;
    System.out.println("Cake()");
  }

}
