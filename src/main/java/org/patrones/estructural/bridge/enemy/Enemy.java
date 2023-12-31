package org.patrones.estructural.bridge.enemy;

import org.patrones.estructural.bridge.figther.Figther;

public abstract class Enemy {
  protected int health;
  protected Figther figther;

  public int getHealth() {
    return health;
  }

  public Enemy setHealth(int health) {
    this.health = health;
    return this;
  }

  public Figther getFigther() {
    return figther;
  }

  public Enemy setFigther(Figther figther) {
    this.figther = figther;
    return this;
  }
}
