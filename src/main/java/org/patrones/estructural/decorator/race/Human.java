package org.patrones.estructural.decorator.race;

import org.patrones.estructural.decorator.Enemy;

public class Human implements Enemy {
  @Override
  public void attack() {
    System.out.println("Human attack!!");
  }
}
