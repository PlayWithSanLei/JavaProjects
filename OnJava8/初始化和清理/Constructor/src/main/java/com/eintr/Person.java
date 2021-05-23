/**
 * @author : yixingwei
 * @created : 2021-05-23
**/
package com.eintr;

public class Person {
  public void eat (Apple apple) {
    Apple peeled = apple.getPeeled();
    System.out.println("好吃");
  }
}

class Apple {
  Apple getPeeled() {
    return Peel.peel(this);
  }
}

class Peel {
  static Apple peel(Apple apple) {
    return apple;
  }
}
