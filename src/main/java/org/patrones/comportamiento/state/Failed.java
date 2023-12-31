package org.patrones.comportamiento.state;

public class Failed implements MisionState{
  @Override
  public void next(Mision mision) {
    mision.setState(new Progress());
  }

  @Override
  public String print() {
    return "is failed";
  }
}
