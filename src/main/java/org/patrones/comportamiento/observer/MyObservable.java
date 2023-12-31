package org.patrones.comportamiento.observer;

public interface MyObservable {
  void suscribe(MyObserver observer);
  void unsuscribe(MyObserver observer);
  void broadcast();

}
