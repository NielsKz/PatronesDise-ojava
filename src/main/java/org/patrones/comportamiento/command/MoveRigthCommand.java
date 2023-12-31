package org.patrones.comportamiento.command;

public class MoveRigthCommand implements Command {
  private Player player;

  public MoveRigthCommand(Player player) {
    this.player = player;
  }

  @Override
  public void execute() {
    player.moveRigth();
  }
}
