package org.patrones.comportamiento.chainresponsibility;

public class FireAttack extends ElementaryAttack{
  public FireAttack() {
  }

  public FireAttack(ElementaryAttack next) {
    super(next);
  }
  @Override
  public void attack(Player player) {
    if(player.getTypePlayer().equals((TypePlayer.VAMPIRE)))
      System.out.println("FIRE Attack!!!");
    else if (hasNext())
      getNext().attack(player);
    else
      System.out.println("NO Attack was found!!!");
  }
}
