package org.patrones.comportamiento.state;

public class Completed implements MisionState{
  @Override
  public void next(Mision mision) {
    System.out.println(mision.getName() +  "is compelted, no next state");
  }

  @Override
  public String print() {
    return "is completed";
  }
}
