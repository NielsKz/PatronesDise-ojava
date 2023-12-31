package org.patrones.comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Vigilant extends Enemy implements MyObservable {
  private List<MyObserver> observers = new ArrayList<>();
  public Vigilant(String name) {
    super(name);
    setActive(true);
  }

  @Override
  public void attack() {
    System.out.println(getName() + "Vigilant on attack!!");
  }

  @Override
  public void activated() {
    System.out.println(getName()+"sending messages");
    broadcast();
  }

  @Override
  public void suscribe(MyObserver observer) {
    observers.add(observer);
  }

  @Override
  public void unsuscribe(MyObserver observer) {
    observers.remove(observer);
  }

  @Override
  public void broadcast() {
    for (MyObserver observer:observers) {
      observer.update();
    }
  }
}
