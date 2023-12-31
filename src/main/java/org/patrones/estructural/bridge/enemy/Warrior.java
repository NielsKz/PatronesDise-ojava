package org.patrones.estructural.bridge.enemy;

import org.patrones.estructural.bridge.figther.Figther;
import org.patrones.estructural.bridge.figther.WarriorFigtherImpl;

public class Warrior extends Enemy {

  public Warrior() {
    setFigther(new WarriorFigtherImpl());
  }

  @Override
  public int getHealth() {
    return super.getHealth();
  }

  @Override
  public Enemy setHealth(int health) {
    return super.setHealth(health);
  }

  public void attack() {
    System.out.println("Warrior:");
    getFigther().attack();
  }

  public void protect() {
    System.out.println("Warrior:");
    getFigther().protect();
  }

  @Override
  public Figther getFigther() {
    return super.getFigther();
  }

  @Override
  public Enemy setFigther(Figther figther) {
    return super.setFigther(figther);
  }
}
