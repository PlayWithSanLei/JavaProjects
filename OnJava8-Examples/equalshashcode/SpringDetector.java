// equalshashcode/SpringDetector.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// What will the weather be?
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.lang.reflect.*;

public class SpringDetector {
  public static <T extends Groundhog>
  void detectSpring(Class<T> type) {
    try {
      Constructor<T> ghog =
        type.getConstructor(int.class);
      Map<Groundhog, Prediction> map =
        IntStream.range(0, 10)
        .mapToObj(i -> {
          try {
            return ghog.newInstance(i);
          } catch(Exception e) {
            throw new RuntimeException(e);
          }
        })
        .collect(Collectors.toMap(
          Function.identity(),
          gh -> new Prediction()));
      map.forEach((k, v) ->
        System.out.println(k + ": " + v));
      Groundhog gh = ghog.newInstance(3);
      System.out.println(
        "Looking up prediction for " + gh);
      if(map.containsKey(gh))
        System.out.println(map.get(gh));
      else
        System.out.println("Key not found: " + gh);
    } catch(NoSuchMethodException |
            IllegalAccessException |
            InvocationTargetException |
            InstantiationException e) {
      throw new RuntimeException(e);
    }
  }
  public static void main(String[] args) {
    detectSpring(Groundhog.class);
  }
}
/* Output:
Groundhog #5: Six more weeks of Winter!
Groundhog #2: Early Spring!
Groundhog #1: Six more weeks of Winter!
Groundhog #0: Early Spring!
Groundhog #8: Early Spring!
Groundhog #6: Six more weeks of Winter!
Groundhog #4: Early Spring!
Groundhog #3: Early Spring!
Groundhog #7: Six more weeks of Winter!
Groundhog #9: Six more weeks of Winter!
Looking up prediction for Groundhog #3
Key not found: Groundhog #3
*/
