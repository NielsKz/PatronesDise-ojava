package org.patrones.comportamiento.mediator;

public class TestMediator {
  public static void main(String[] args) {
    Mediator mediator = new Mediator();

    Enemy enemy1 = new Enemy("enemy 1",mediator);
    Enemy enemy2 = new Enemy("enemy 2",mediator);
    Enemy enemy3 = new Enemy("enemy 3",mediator);
    enemy1.send();
  }
}
