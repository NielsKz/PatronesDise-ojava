package org.patrones.estructural.flyweigth;

import org.patrones.estructural.flyweigth.assets.Prefab;

public class Npc {
  private static final int MAX_HEALTH = 100;
  private static int id = 1;
  private String name;
  private int health;
  private Coodinates coodinates;
  private Prefab prefab;


  public Npc(Prefab prefab) {
    this.name = "NPC::" + id;
    this.health = MAX_HEALTH;
    this.coodinates = Coodinates.getCoodinates();
    this.prefab = prefab;
    id++;
  }
  public void ShowNpc(){
    System.out.println("name " + name);
    System.out.println("health " + health);
    System.out.println("coodinates " + coodinates);
    System.out.println("============== ");
    System.out.println(prefab);
  }
}
