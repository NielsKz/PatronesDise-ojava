package org.patrones.comportamiento.strategy;

public class MageAttack implements AttackStrategy{

  @Override
  public void Attack(Player player) {
    System.out.println(player.getName()+" health before mage attack "+player.getHealth());
    System.out.println("mage attacking");
    player.setHealth(player.getHealth()-20);
    System.out.println(player.getName()+" health after mage attack "+player.getHealth());
  }
}
