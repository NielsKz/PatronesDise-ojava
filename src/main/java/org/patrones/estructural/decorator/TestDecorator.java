package org.patrones.estructural.decorator;

import org.patrones.estructural.decorator.decorator.AssassinEnemyDecorator;
import org.patrones.estructural.decorator.decorator.MageEnemyDecorator;
import org.patrones.estructural.decorator.decorator.WarriorEnemyDecorator;
import org.patrones.estructural.decorator.race.Elf;
import org.patrones.estructural.decorator.race.Human;

public class TestDecorator {
  public static void main(String[] args) {
    System.out.println("===========HUMAN warrior ==============");
    Enemy humanWarrior = new WarriorEnemyDecorator(new Human());
    humanWarrior.attack();

    System.out.println("===========HUMAN warrior Mage ==============");
    Enemy humanWarriorMage = new WarriorEnemyDecorator(new MageEnemyDecorator(new Human()));
    humanWarriorMage.attack();


    System.out.println("===========Elf warrior Mage assassin ==============");
    Enemy elfWarriorMageAssassin = new AssassinEnemyDecorator(
      new MageEnemyDecorator(
        new WarriorEnemyDecorator(
          new Elf()
        )
      )
    );
    elfWarriorMageAssassin.attack();

  }
}
