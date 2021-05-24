/**
 * @author : eintr
 * @created : 2021-05-24
**/

package com.eintr;

public class Mugs {
  Mug m1;
  Mug m2;

  Mugs() {
    System.out.println("Mugs()");
  }

  Mugs(int i) {
    System.out.printf("Mugs(%d)\n", i);
  }

  {
    m1 = new Mug(1);
    m2 = new Mug(2);
  }
}

class Mug {
  Mug(int i) {
    System.out.printf("Mug(%d)\n", i);
  }

}
