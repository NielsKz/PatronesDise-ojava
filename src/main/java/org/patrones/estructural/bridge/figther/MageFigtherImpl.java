package org.patrones.estructural.bridge.figther;

public class MageFigtherImpl implements Figther {
  @Override
  public void attack() {
    System.out.println("Mage attack!!");
  }

  @Override
  public void protect() {
    System.out.println("Mage protect!!");
  }
}
