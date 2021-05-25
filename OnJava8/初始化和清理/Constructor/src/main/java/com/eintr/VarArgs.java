/**
 * @author : eintr
 * @created : 2021-05-25
**/
package com.eintr;

public class VarArgs {
  static void printArray(Object... args) {
    for (Object obj : args) {
      System.out.println(obj+" "+obj.getClass());
    }
    System.out.println();
  }

  public static void main(String Args[]){
    printArray(new Object[] {22, "Hello", 3.14, new A(), new B()});
  }
}

class A {}
class B {}
