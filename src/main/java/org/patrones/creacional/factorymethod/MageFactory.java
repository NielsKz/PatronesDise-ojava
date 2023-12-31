package org.patrones.creacional.factorymethod;

public class MageFactory extends EnemyFactory {
  @Override
  public Enemy createEnemy() {
    return new Mage();
  }
}
