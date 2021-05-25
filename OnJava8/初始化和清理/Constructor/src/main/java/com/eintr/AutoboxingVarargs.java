/**
 * @author : eintr
 * @created : 2021-05-25
**/
public class AutoboxingVarargs {
  public static void f(Integer... args) {
    for (Intege i : args) {
      System.out.println(i);
    }
  }
}
