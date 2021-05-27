// interfaces/Machine.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
import java.util.*;
import onjava.Operations;

class Bing implements Operations {
  @Override public void execute() {
    Operations.show("Bing");
  }
}

class Crack implements Operations {
  @Override public void execute() {
    Operations.show("Crack");
  }
}

class Twist implements Operations {
  @Override public void execute() {
    Operations.show("Twist");
  }
}

public class Machine {
  public static void main(String[] args) {
    Operations.runOps(
      new Bing(), new Crack(), new Twist());
  }
}
/* Output:
Bing
Crack
Twist
*/
