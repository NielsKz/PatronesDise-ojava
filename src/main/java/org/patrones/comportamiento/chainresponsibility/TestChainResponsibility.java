package org.patrones.comportamiento.chainresponsibility;

public class TestChainResponsibility {
  public static void main(String[] args) {
    Player player = new Player(TypePlayer.ASSASSIN);
    Mage mage= new Mage(new FireAttack(new IceAttack(new ElectryAttack())));
    mage.chainAttack(player);
  }
}
