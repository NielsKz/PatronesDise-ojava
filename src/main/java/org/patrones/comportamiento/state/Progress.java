package org.patrones.comportamiento.state;

public class Progress implements MisionState{
  @Override
  public void next(Mision mision) {
    if(Math.random()< 0.5)
      mision.setState(new Completed());
    else
      mision.setState(new Failed());
  }

  @Override
  public String print() {
    return " is in progress";
  }
}
