package org.patrones.creacional.abstracfactory.factory;

import org.patrones.creacional.abstracfactory.armor.Armor;
import org.patrones.creacional.abstracfactory.armor.HeavyArmor;
import org.patrones.creacional.abstracfactory.enemy.Enemy;
import org.patrones.creacional.abstracfactory.enemy.Warrior;
import org.patrones.creacional.abstracfactory.weapon.Axe;
import org.patrones.creacional.abstracfactory.weapon.Weapon;

public class WarriorFactory extends EnemyAbstractFactory{
  @Override
  public Enemy createEnemy() {
    return new Warrior();
  }

  @Override
  public Armor createArmor() {
    return new HeavyArmor();
  }

  @Override
  public Weapon createWeapon() {
    return new Axe();
  }
}
