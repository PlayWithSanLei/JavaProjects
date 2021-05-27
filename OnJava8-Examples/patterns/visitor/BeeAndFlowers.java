// patterns/visitor/BeeAndFlowers.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Demonstration of the Visitor pattern.
// {java patterns.visitor.BeeAndFlowers}
package patterns.visitor;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

interface Visitor {
  void visit(Gladiolus g);
  void visit(Ranunculus r);
  void visit(Chrysanthemum c);
}

// The Flower hierarchy cannot be changed:
interface Flower {
  void accept(Visitor v);
}

class Gladiolus implements Flower {
  @Override
  public void accept(Visitor v) { v.visit(this);}
}

class Ranunculus implements Flower {
  @Override
  public void accept(Visitor v) { v.visit(this);}
}

class Chrysanthemum implements Flower {
  @Override
  public void accept(Visitor v) { v.visit(this);}
}

// Add the ability to produce a String:
class StringVal implements Visitor {
  private String s;
  @Override public String toString() { return s; }
  @Override public void visit(Gladiolus g) {
    s = "Gladiolus";
  }
  @Override public void visit(Ranunculus r) {
    s = "Ranunculus";
  }
  @Override public void visit(Chrysanthemum c) {
    s = "Chrysanthemum";
  }
}

// Add the ability to do "Bee" activities:
class Bee implements Visitor {
  @Override public void visit(Gladiolus g) {
    System.out.println("Bee and Gladiolus");
  }
  @Override public void visit(Ranunculus r) {
    System.out.println("Bee and Ranunculus");
  }
  @Override public void visit(Chrysanthemum c) {
    System.out.println("Bee and Chrysanthemum");
  }
}

class FlowerFactory {
  static List<Supplier<Flower>> flowers =
    Arrays.asList(Gladiolus::new,
      Ranunculus::new, Chrysanthemum::new);
  static final int SZ = flowers.size();
  private static SplittableRandom rand =
    new SplittableRandom(47);
  public static Flower newFlower() {
    return flowers.get(rand.nextInt(SZ)).get();
  }
}

public class BeeAndFlowers {
  public static void main(String[] args) {
    List<Flower> flowers =
      Stream.generate(FlowerFactory::newFlower)
        .limit(10)
        .collect(Collectors.toList());
    StringVal sval = new StringVal();
    flowers.forEach(f -> {
      f.accept(sval);
      System.out.println(sval);
    });
    // Perform "Bee" operation on all Flowers:
    Bee bee = new Bee();
    flowers.forEach(f -> f.accept(bee));
  }
}
/* Output:
Gladiolus
Chrysanthemum
Gladiolus
Ranunculus
Chrysanthemum
Ranunculus
Chrysanthemum
Chrysanthemum
Chrysanthemum
Ranunculus
Bee and Gladiolus
Bee and Chrysanthemum
Bee and Gladiolus
Bee and Ranunculus
Bee and Chrysanthemum
Bee and Ranunculus
Bee and Chrysanthemum
Bee and Chrysanthemum
Bee and Chrysanthemum
Bee and Ranunculus
*/
