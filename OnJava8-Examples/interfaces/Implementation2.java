// interfaces/Implementation2.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.

public class Implementation2
implements InterfaceWithDefault {
  @Override public void firstMethod() {
    System.out.println("firstMethod");
  }
  @Override public void secondMethod() {
    System.out.println("secondMethod");
  }
  public static void main(String[] args) {
    InterfaceWithDefault i =
      new Implementation2();
    i.firstMethod();
    i.secondMethod();
    i.newMethod();
  }
}
/* Output:
firstMethod
secondMethod
newMethod
*/
