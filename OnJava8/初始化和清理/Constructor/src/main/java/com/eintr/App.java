/**
 * @author : eintr
 * @created : 2021-05-23
 */
package com.eintr;

public class App {
  public static void main(String[] args) {
    Other.main(new String[]{"Hello", "World", "!!!"});
  }
}

class Other {
  public static void main(String []Args) {
    for (String i : Args) {
      System.out.printf("%s ", i);
    }
  }
}
