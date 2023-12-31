package org.patrones.estructural.proxy;

public class TestProxy {
  public static void main(String[] args) {
    GameImpl gameImpl = new GameImpl();
    gameImpl.newGame("player 1");
    ProxyGameImpl proxygame = new ProxyGameImpl(gameImpl);
    proxygame.load("player 1");
    System.out.println(proxygame.getStats());
    proxygame.getStats().setKill(10);
    proxygame.getStats().setDeaths(2);
    proxygame.getStats().setLevel(10);
    proxygame.save("player 1");
    proxygame.load("player 1");
    System.out.println(proxygame.getStats());


  }
}
