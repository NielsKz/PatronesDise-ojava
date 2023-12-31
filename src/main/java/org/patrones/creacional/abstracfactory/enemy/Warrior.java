package org.patrones.creacional.abstracfactory.enemy;

public class Warrior implements Enemy{
  @Override
  public void attack() {
    System.out.println("Warrior attack!!!");
  }
}
