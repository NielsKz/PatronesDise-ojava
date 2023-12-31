package org.patrones.creacional.factory;

public class TestFactory {
  public static void main(String[] args) {
    EnemyFactory enemyFactory = new EnemyFactory();
    Enemy warrior = enemyFactory.createEnemy("warrior");
    Mage mage = (Mage) enemyFactory.createEnemy("mage");
    warrior.attack();
    mage.attack();

  }
}
