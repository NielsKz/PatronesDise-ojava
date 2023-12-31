package org.patrones.estructural.bridge;

import org.patrones.estructural.bridge.enemy.Mage;
import org.patrones.estructural.bridge.enemy.Warrior;
import org.patrones.estructural.bridge.figther.MageFigtherImpl;
import org.patrones.estructural.bridge.figther.WarriorFigtherImpl;

public class TestBridge {
  public static void main(String[] args) {
    System.out.println("===========WARRIOR=============");
    Warrior warrior = new Warrior();
    warrior.attack();
    warrior.protect();

    warrior.setFigther(new MageFigtherImpl());
    warrior.attack();
    warrior.protect();

    System.out.println("===========MAGE=============");
    Mage mage = new Mage();
    mage.attack();
    mage.protect();

    mage.setFigther(new WarriorFigtherImpl());
    mage.attack();
    mage.protect();

  }
}
