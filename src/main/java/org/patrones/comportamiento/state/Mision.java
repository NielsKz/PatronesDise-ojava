package org.patrones.comportamiento.state;

public class Mision {
  private String name;
  private MisionState state;

  public Mision(String name) {
    this.name = name;
    state = new Blocked();
  }
  public void next(){
    state.next(this);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MisionState getState() {
    return state;
  }

  public void setState(MisionState state) {
    this.state = state;
  }

  @Override
  public String toString() {
    return getName() + state.print();
  }
}
