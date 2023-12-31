package org.patrones.comportamiento.chainresponsibility;

public class Player {
  private TypePlayer typePlayer;

  public Player(TypePlayer typePlayer) {
    this.typePlayer = typePlayer;
  }

  public TypePlayer getTypePlayer() {
    return typePlayer;
  }

  public void setTypePlayer(TypePlayer typePlayer) {
    this.typePlayer = typePlayer;
  }
}
