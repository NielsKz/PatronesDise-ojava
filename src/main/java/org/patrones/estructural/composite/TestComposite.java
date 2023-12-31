package org.patrones.estructural.composite;

public class TestComposite {
  public static void main(String[] args) {
    BaseItem inventory = new Bag("invetory");
    BaseItem bagCoins = new Bag("bagCoins");
    BaseItem bagPotions = new Bag("bagPotions");

    BaseItem coins = new Item("coins",6);
    bagCoins.add(coins);

    BaseItem magicPotion = new Item("magicPotion",3);
    BaseItem healthPotion = new Item("healthPotion",3);
    bagPotions.add(magicPotion);
    bagPotions.add(healthPotion);

    BaseItem blade = new Item("blade",3);
    BaseItem shield = new Item("shield",3);
    BaseItem armor = new Item("armor",3);

    inventory.add(bagCoins);
    inventory.add(bagPotions);
    inventory.add(blade);
    inventory.add(shield);
    inventory.add(armor);

    System.out.println(inventory.getValue());

  }
}
