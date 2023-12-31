package org.patrones.estructural.bridge.enemy;

import org.patrones.estructural.bridge.figther.Figther;
import org.patrones.estructural.bridge.figther.MageFigtherImpl;

public class Mage extends Enemy  {
  public Mage() {
    setFigther(new MageFigtherImpl());
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
    System.out.println("Mage:");
    getFigther().attack();
  }

  public void protect() {
    System.out.println("Mage:");
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
