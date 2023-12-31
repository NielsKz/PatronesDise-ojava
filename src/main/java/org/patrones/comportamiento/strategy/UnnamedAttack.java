package org.patrones.comportamiento.strategy;

public class UnnamedAttack implements AttackStrategy{
  @Override
  public void Attack(Player player) {
    System.out.println(player.getName()+" health before unnamed attack "+player.getHealth());
    System.out.println("unnamed attacking");
    player.setHealth(player.getHealth()-20);
    System.out.println(player.getName()+" health after unnamed attack "+player.getHealth());
  }
}
