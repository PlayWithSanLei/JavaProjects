package com.eintr;

/**
 * Hello world!
 *
 */

import com.eintr.food.Cake;

public class App 
{
  public static void main( String[] args )
  {
    Cake c = new Cake();
    // c.f(); //引用不到
    c.f(2);
    System.out.println( "Hello World!" );
  }
}
