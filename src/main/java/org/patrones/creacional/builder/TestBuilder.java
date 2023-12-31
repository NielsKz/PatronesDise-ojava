package org.patrones.creacional.builder;

public class TestBuilder {
  public static void main(String[] args) {
    Enemy enemy = Enemy.builder()
      .name("Pepe")
      .type("Mago")
      .health(100)
      .damage(500)
      .endurance(200)
      .builder();
    System.out.println(enemy.toString());
  }
}
