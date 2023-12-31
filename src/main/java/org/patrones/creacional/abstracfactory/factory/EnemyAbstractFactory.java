package org.patrones.creacional.abstracfactory.factory;

import org.patrones.creacional.abstracfactory.armor.Armor;
import org.patrones.creacional.abstracfactory.enemy.Enemy;
import org.patrones.creacional.abstracfactory.weapon.Weapon;

public abstract class EnemyAbstractFactory {
  public abstract Enemy createEnemy();
  public abstract Armor createArmor();
  public abstract Weapon createWeapon();
}
