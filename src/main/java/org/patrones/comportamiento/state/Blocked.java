package org.patrones.comportamiento.state;

public class Blocked implements MisionState{
  @Override
  public void next(Mision mision) {
    mision.setState(new UnBlocked());

  }

  @Override
  public String print() {
    return "is blocked";
  }
}
