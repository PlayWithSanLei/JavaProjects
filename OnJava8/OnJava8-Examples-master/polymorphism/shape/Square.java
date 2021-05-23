// polymorphism/shape/Square.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package polymorphism.shape;

public class Square extends Shape {
  @Override public void draw() {
    System.out.println("Square.draw()");
  }
  @Override public void erase() {
    System.out.println("Square.erase()");
  }
}
