package org.patrones.comportamiento.observer;

public class Warrior extends Enemy implements MyObserver{
  public Warrior(String name) {
    super(name);
    setActive(false);
  }

  @Override
  public void attack() {
    System.out.println(getName() + "warrior on attack!!");
  }

  @Override
  public void activated() {
    setActive(true);
    System.out.println(getName() + "warrior is active!!");
  }

  @Override
  public void update() {
    activated();
    attack();
  }
}
