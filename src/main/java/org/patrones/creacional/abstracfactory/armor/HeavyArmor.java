package org.patrones.creacional.abstracfactory.armor;

public class HeavyArmor implements Armor {
  @Override
  public void protect() {
    System.out.println("Heavy Armor Protect!!!");
  }
}
