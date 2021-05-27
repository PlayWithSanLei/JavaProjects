package com.eintr;

/**
 * @author : eintr
 * @created : 2021-05-27
 **/

class Homer {
  char doh(char c) {
    System.out.println("doh(char)");
    return 'd';
  }

  float doh(float f) {
    System.out.println("doh(float)");
    return f;
  }
}

class Milhouse {
}

class Bart extends Homer {
  void doh(Milhouse m) {
    System.out.println("doh(MilHouse)");
  }
}

class Lisa extends Homer {
  @Override
  void doh(Milhouse m) {
    System.out.println("doh(Milhouse)");
  }
}

public class Hide {
  public static void main(String[] args) {
    Bart b = new Bart();
    b.doh('c');
    b.doh(1.1f);
    b.doh(0);
    b.doh(new Milhouse());
    Lisa l = new Lisa();
    l.doh(new Milhouse());
  }
}
