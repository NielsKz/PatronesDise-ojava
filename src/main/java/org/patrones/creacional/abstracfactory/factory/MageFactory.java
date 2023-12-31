package org.patrones.creacional.abstracfactory.factory;

import org.patrones.creacional.abstracfactory.armor.Armor;
import org.patrones.creacional.abstracfactory.armor.Robe;
import org.patrones.creacional.abstracfactory.enemy.Enemy;
import org.patrones.creacional.abstracfactory.enemy.Mage;
import org.patrones.creacional.abstracfactory.weapon.Weapon;
import org.patrones.creacional.abstracfactory.weapon.WizardStaff;

public class MageFactory extends EnemyAbstractFactory{
  @Override
  public Enemy createEnemy() {
    return new Mage();
  }

  @Override
  public Armor createArmor() {
    return new Robe();
  }

  @Override
  public Weapon createWeapon() {
    return new WizardStaff();
  }
}
