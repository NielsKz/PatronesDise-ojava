package org.patrones.creacional.abstracfactory;

import org.patrones.creacional.abstracfactory.armor.Armor;
import org.patrones.creacional.abstracfactory.enemy.Enemy;
import org.patrones.creacional.abstracfactory.factory.EnemyAbstractFactory;
import org.patrones.creacional.abstracfactory.factory.MageFactory;
import org.patrones.creacional.abstracfactory.factory.WarriorFactory;
import org.patrones.creacional.abstracfactory.weapon.Weapon;

public class TestAbstractFactory {
  public static void main(String[] args) {
    EnemyAbstractFactory factory = new WarriorFactory();
    Enemy warrior = factory.createEnemy();
    Armor heavyArmor = factory.createArmor();
    Weapon axe = factory.createWeapon();
    warrior.attack();
    heavyArmor.protect();
    axe.damage();

    factory = new MageFactory();
    Enemy mage = factory.createEnemy();
    Armor robe = factory.createArmor();
    Weapon wizardStaff = factory.createWeapon();
    mage.attack();
    robe.protect();
    wizardStaff.damage();

  }
}
