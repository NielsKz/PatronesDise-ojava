package org.patrones.comportamiento.observer;

public class TestObservable {
  public static void main(String[] args) {
    Warrior warrior1 = new Warrior("warrior1");
    Warrior warrior2 = new Warrior("warrior2");
    Mage mage1 = new Mage("mage1");
    Mage mage2 = new Mage("mage2");

    Vigilant vigilant = new Vigilant("vigilant");
    vigilant.suscribe(warrior1);
    vigilant.suscribe(warrior2);
    vigilant.suscribe(mage1);
    vigilant.suscribe(mage2);
    vigilant.activated();
    System.out.println("***********************");
    vigilant.unsuscribe(mage2);
    vigilant.activated();

  }
}
