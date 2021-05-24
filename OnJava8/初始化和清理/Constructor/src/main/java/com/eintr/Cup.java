/**
 * @author : eintr
 * @created : 2021-05-24
**/
package com.eintr;

public class Cup {
  static cup c1;
  static cup c2;
  
  static {
    c1 = new cup();
    c1 = new cup(1);
    c2 = new cup(2);
  }

  Cup() {
    System.out.printf("Cup()\n");
  }
}


class cup {
   cup() {
    System.out.printf("cup()\n");
  }
   cup(int marker) {
    System.out.printf("cup(%d)\n", marker);
  }

  void f(int marker) {
    System.out.printf("f(%d)\n", marker);
  }
 
}
