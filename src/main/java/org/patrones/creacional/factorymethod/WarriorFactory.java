package org.patrones.creacional.factorymethod;

public class WarriorFactory extends EnemyFactory {
  @Override
  public Enemy createEnemy() {
    return new Warrior();
  }
}
