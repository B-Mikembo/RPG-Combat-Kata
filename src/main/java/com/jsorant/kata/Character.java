package com.jsorant.kata;

public class Character {
  private int health;

  public Character() {
    health = 1000;
  }

  public int health() {
    return health;
  }

  public void receiveDamage(int damage) {
    health -= damage;
  }

  public int level() {
    return 1;
  }
}
