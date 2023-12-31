package org.patrones.comportamiento.mediator;

import java.util.ArrayList;
import java.util.List;

public class Enemy implements Combat{
  private String name;
  private Mediator mediator;

  public Enemy(String name, Mediator mediator) {
    this.name = name;
    this.mediator = mediator;
    mediator.add(this);
  }


  public String getName(){
    return name;
  }

  @Override
  public String toString() {
    return "name='" + name;
  }

  @Override
  public void send() {
    System.out.println("sending message from " + name);
    mediator.send(this);
  }

  @Override
  public void receive(Combat combat) {
    System.out.println("message received from " + ((Enemy) combat).getName() + ":" + name+ "attack mode activated");

  }
}
