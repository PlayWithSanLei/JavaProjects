/**
 * @author : yixingwei
 * @created : 2021-05-23
 **/
package com.eintr;

public class Tree {
  int height;
  Left leave;

  Tree() {
    System.out.println("种下一粒种");
    height = 0;
  }
  Tree(int initheight) {
    height = initheight;
    System.out.println("栽下一株苗 苗高:"+height);
  }
  void info() {
    System.out.println("Tree is " + height + " m tall");
    Left res = new Left();
    for (int i = 0;i < 10;i++) {
      res = res.inc();
      System.out.println("有叶子 " + res.i + "片");
    }
  }
  void info(String s) {
    System.out.println(s + ": Tree is " + height + " m tall");
  }
}

class Left {
  int i = 0;
  Left inc() {
    i++;
    return this;
  }

  void Leftleft() {
    System.out.println("i=" + i);
  }
}
