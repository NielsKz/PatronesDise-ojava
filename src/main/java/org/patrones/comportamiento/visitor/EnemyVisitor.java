package org.patrones.comportamiento.visitor;

public class EnemyVisitor implements Visitor{
  @Override
  public void visit(Warrior warrior) {
    System.out.println("visiting warrior");
    warrior.powerAttack();
  }

  @Override
  public void visit(Mage mage) {
    System.out.println("visiting mage");
    mage.elementaryAttack();
  }

  @Override
  public void visit(Assassin assassin) {
    System.out.println("visiting assassin");
    assassin.stealthAttack();
  }
}
