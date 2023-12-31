package org.patrones.comportamiento.state;

public class TestState {
  public static void main(String[] args) {
    Mision mision = new Mision("mision 1");
    System.out.println(mision);
    mision.next();
    System.out.println(mision);
    mision.next();
    System.out.println(mision);
    mision.next();
    System.out.println(mision);
    mision.next();
    System.out.println(mision);

  }
}
