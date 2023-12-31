package org.patrones.comportamiento.command;

public class Player {
  private int posX,posY,posZ;

  public Player(int posX, int posY, int posZ) {
    this.posX = posX;
    this.posY = posY;
    this.posZ = posZ;
  }
  public void moveFront(){
    posZ++;
    System.out.println("position Z:  " + posZ);
  }
  public void moveBack(){
    posZ--;
    System.out.println("position Z:  " + posZ);
  }
  public void moveRigth(){
    posX++;
    System.out.println("position X:  " + posX);
  }
  public void moveLeft(){
    posX--;
    System.out.println("position X:  " + posX);
  }
  public void jump(){
    posY++;
    System.out.println("position Y:  " + posY);
    try {
      Thread.sleep(500);
      posY--;
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("position Y:  " + posY);

  }
}
