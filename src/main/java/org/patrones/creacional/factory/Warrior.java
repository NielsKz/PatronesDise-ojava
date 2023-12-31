package org.patrones.creacional.factory;

public class Warrior implements Enemy {
  @Override
  public void attack() {
    System.out.println("Warrior attack!!");
  }
}
