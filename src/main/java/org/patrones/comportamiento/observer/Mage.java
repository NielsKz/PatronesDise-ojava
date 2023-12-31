package org.patrones.comportamiento.observer;

public class Mage extends Enemy implements MyObserver{
  public Mage(String name) {
    super(name);
    setActive(false);
  }

  @Override
  public void attack() {
    System.out.println(getName() + "Mage on attack!!");
  }

  @Override
  public void activated() {
    setActive(true);
    System.out.println(getName() + "Mage is active!!");
  }
  @Override
  public void update() {
    activated();
    attack();
  }

}
