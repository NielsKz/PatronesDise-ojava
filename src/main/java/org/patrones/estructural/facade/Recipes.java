package org.patrones.estructural.facade;

public interface Recipes {
  static boolean getrecipes(String name, boolean make){
    String action = make ? "make":"improve";
    if(Math.random() > 0.5){
      System.out.println("you have the necessary to "+ action +" the " + name);
      return true;
    }
    else
    {
      System.out.println("you don't have the necessary to "+ action +" the " + name);
      return false;
    }
  }
}
