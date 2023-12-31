package org.patrones.estructural.flyweigth.assets;

import java.util.ArrayList;
import java.util.List;

public class Prefab {
  private static int id = 1;
  private String name;
  private List<Animation> animations = new ArrayList<>();
  private List<Textures> textures = new ArrayList<>();
  private List<Sounds> sounds = new ArrayList<>();

  public Prefab(List<Animation> animations, List<Textures> textures, List<Sounds> sounds) {
    this.name = "Prefab::"+id;
    this.animations = animations;
    this.textures = textures;
    this.sounds = sounds;
    id++;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "name='" + name + '\n' +
      "animations=" + animations +
      "textures=" + textures +
      "sounds=" + sounds;
  }
}
