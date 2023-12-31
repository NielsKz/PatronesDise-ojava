package org.patrones.estructural.facade;

public class WorkBench implements Smithy{
  public static final String ACTION = "improve";
  @Override
  public void work(String name) {
    System.out.println("let "+ACTION+" the "+ name +"....");
  }

  @Override
  public boolean search(String name) {
    return Invetory.search(name,false);
  }

  @Override
  public void remove(String name) {
    Invetory.remove(name, false);
  }

  @Override
  public void working(String name) {
    System.out.println("improving " + name);
  }
}
