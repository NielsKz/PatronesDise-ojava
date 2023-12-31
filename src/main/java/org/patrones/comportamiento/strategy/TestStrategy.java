package org.patrones.comportamiento.strategy;

public class TestStrategy {
  public static void main(String[] args) {
    Player player = new Player("player 1");
    Enemy enemy = new Enemy("enemy 1");
    enemy.attack(player);
    System.out.println("***************************");
    enemy.setAttackStrategy(new WarriorAttack());
    enemy.attack(player);
    System.out.println("***************************");
    enemy.setAttackStrategy(new MageAttack());
    enemy.attack(player);
  }
}
