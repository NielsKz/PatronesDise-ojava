package org.patrones.estructural.flyweigth;

public class Coodinates {
  private  int posX, posY, posZ;

  public Coodinates() {
    posX = (int) (Math.random()*100);
    posY = (int) (Math.random()*100);
    posZ = (int) (Math.random()*100);
  }
  public static Coodinates getCoodinates(){
    return new Coodinates();
  }

  @Override
  public String toString() {
    return "posX=" + posX +
      "posY=" + posY +
      "posZ=" + posZ;
  }
}
