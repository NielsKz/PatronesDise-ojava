package org.patrones.comportamiento.command;

import java.util.HashMap;

public class MovementInvoker {
  private HashMap<Character, Command> commandHashMap = new HashMap<>();
  private Player player;

  public MovementInvoker(Player player) {
    this.player = player;
    commandHashMap.put('w', new MoveFrontCommand(player));
    commandHashMap.put('a', new MoveLeftCommand(player));
    commandHashMap.put('s', new MoveBackCommand(player));
    commandHashMap.put('d', new MoveRigthCommand(player));
    commandHashMap.put('j', new JumpCommand(player));

  }

  public void move(char c){
    if(!commandHashMap.containsKey(c))
      System.out.println("command not found");
    else
      commandHashMap.get(c).execute();
  }

}
