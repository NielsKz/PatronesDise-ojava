package org.patrones.estructural.decorator.decorator;

import org.patrones.estructural.decorator.Enemy;

public class AssassinEnemyDecorator extends EnemyDecorator{
  public AssassinEnemyDecorator(Enemy enemy) {
    super(enemy);
  }

  @Override
  public void attack() {
    super.attack();
    System.out.println("Assassin attack");
  }
}
