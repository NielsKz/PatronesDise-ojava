package org.patrones.estructural.facade;

public interface Invetory {
  static boolean search(String name, boolean make){
    String action = make ? "make":"improve";
    if(Math.random() > 0.5){
      System.out.println("you have the necessary material to "+ action +" the " + name);
      return true;
    }
    else
    {
      System.out.println("you don't have the necessary material to "+ action +" the " + name);
      return false;
    }
  }

  static void remove(String name, boolean make){
    String action = make ? "make":"improve";
    System.out.println("removing from your inventory the material used to "+ action +" the " + name);
  }
}
