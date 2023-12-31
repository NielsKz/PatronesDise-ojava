package org.patrones.comportamiento.chainresponsibility;

public class IceAttack extends ElementaryAttack{
  public IceAttack() {
  }

  public IceAttack(ElementaryAttack next) {
    super(next);
  }

  @Override
  public void attack(Player player) {
    if(player.getTypePlayer().equals((TypePlayer.WARRIOR)))
      System.out.println("ICE Attack!!!");
    else if (hasNext())
      getNext().attack(player);
    else
      System.out.println("NO Attack was found!!!");

  }
}
