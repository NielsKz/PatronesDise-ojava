package org.patrones.comportamiento.strategy;

public class WarriorAttack implements AttackStrategy{
  @Override
  public void Attack(Player player) {
    System.out.println(player.getName()+" health before warrior attack "+player.getHealth());
    System.out.println("warrior attacking");
    player.setHealth(player.getHealth()-20);
    System.out.println(player.getName()+" health after warrior attack "+player.getHealth());
  }
}
