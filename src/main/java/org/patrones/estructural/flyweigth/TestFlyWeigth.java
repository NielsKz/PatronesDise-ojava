package org.patrones.estructural.flyweigth;

import org.patrones.estructural.flyweigth.assets.Animation;
import org.patrones.estructural.flyweigth.assets.Prefab;
import org.patrones.estructural.flyweigth.assets.Sounds;
import org.patrones.estructural.flyweigth.assets.Textures;

import java.util.Arrays;
import java.util.List;

public class TestFlyWeigth {
  public static void main(String[] args) {
    List<Animation> animations = Arrays.asList(
      new Animation("walk"),
      new Animation("run")
    );

    List<Textures> textures = Arrays.asList(
      new Textures("Textures1"),
      new Textures("Textures2")
    );

    List<Sounds> sounds = Arrays.asList(
      new Sounds("bla"),
      new Sounds("ble")
    );

    Prefab prefab1 = new Prefab(animations,textures,sounds);
    Npc npc1 = new Npc(prefab1);
    Npc npc2 = new Npc(prefab1);

    System.out.println("=========== NPC 1 =========");
    npc1.ShowNpc();
    System.out.println("=========== NPC 2 =========");
    npc2.ShowNpc();


    List<Animation> animations2 = Arrays.asList(
      new Animation("dance"),
      new Animation("fly")
    );

    List<Textures> textures2 = Arrays.asList(
      new Textures("Textures3"),
      new Textures("Textures4")
    );

    List<Sounds> sounds2 = Arrays.asList(
      new Sounds("bli"),
      new Sounds("blu")
    );

    Prefab prefab2 = new Prefab(animations2,textures2,sounds2);
    Npc npc3 = new Npc(prefab2);

    System.out.println("=========== NPC 1 =========");
    npc3.ShowNpc();


  }
}
