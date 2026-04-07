package com.jsorant.kata;

public class Character {
  private int health;
  private int level;

  public Character() {
    health = 1000;
    level = 1;
  }

  public int health() {
    return health;
  }

  public void receiveDamage(int damage) {
    health -= damage;
    level++;
  }

  public int level() {
    return level;
  }
}
