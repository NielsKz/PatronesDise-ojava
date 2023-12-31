package org.patrones.comportamiento.templatemethod;

public class TestTemplate {
  public static void main(String[] args) {
    Template templateA = new ConcreteTemplateA();
    templateA.template();

    EnemyTemplate warrior = new Warrior();
    EnemyTemplate mage = new Mage();
    warrior.template();
    mage.template();

  }
}
