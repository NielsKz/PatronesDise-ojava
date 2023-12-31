package org.patrones.estructural.bridge.figther;

public class WarriorFigtherImpl implements Figther{
  @Override
  public void attack() {
    System.out.println("Warrior attack!!");
  }

  @Override
  public void protect() {
    System.out.println("Warrior protect!!");
  }
}
