package org.patrones.creacional.factorymethod;

public class Warrior implements Enemy {
  @Override
  public void attack() {
    System.out.println("Warrior attack!!");
  }
}
