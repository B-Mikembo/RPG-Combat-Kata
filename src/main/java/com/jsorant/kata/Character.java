package com.jsorant.kata;

public class Character {
  private static final int MAX_HEALTH = 1_000;
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
  }

  public int level() {
    return level;
  }

  public void heal(HealingMagicalObject healingMagicalObject) {
    if (health != MAX_HEALTH)
      health = Math.min(MAX_HEALTH, health + healingMagicalObject.health());
  }
}
