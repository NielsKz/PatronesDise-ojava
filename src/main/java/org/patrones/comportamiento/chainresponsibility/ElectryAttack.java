package org.patrones.comportamiento.chainresponsibility;

public class ElectryAttack extends ElementaryAttack{
  public ElectryAttack() {
  }

  public ElectryAttack(ElementaryAttack next) {
    super(next);
  }
  @Override
  public void attack(Player player) {
    if(player.getTypePlayer().equals((TypePlayer.MAGE)))
      System.out.println("ELECTRIC Attack!!!");
    else if (hasNext())
      getNext().attack(player);
    else
      System.out.println("NO Attack was found!!!");

  }
}
