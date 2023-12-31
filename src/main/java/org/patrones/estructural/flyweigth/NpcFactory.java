package org.patrones.estructural.flyweigth;

import org.patrones.estructural.flyweigth.assets.AssetsPrefab;
import org.patrones.estructural.flyweigth.assets.Prefab;

public class NpcFactory {
  public  static  Npc createNpc(Prefab prefab){
    Prefab prefabnew = AssetsPrefab.getPrefab(prefab);
    Npc npc = new Npc(prefabnew);
    return npc;
  }
}
