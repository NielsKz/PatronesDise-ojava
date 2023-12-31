package org.patrones.creacional.singleton;

public class TestSingleton {
  public static void main(String[] args) {
    Thread pepe = new Thread(new RunPepe());
    Thread manolo = new Thread(new RunManolo());
    pepe.start();
    manolo.start();
  }

  static class RunPepe implements Runnable{
    @Override
    public void run() {
      Player player = Player.getPlayer("Pepe");
      System.out.println("Pepe"+player);
    }
  }
  static class RunManolo implements Runnable{
    @Override
    public void run() {
      Player player = Player.getPlayer("Manolo");
      System.out.println("Manolo"+player);
    }
  }
}
