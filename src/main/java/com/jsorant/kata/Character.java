package com.jsorant.kata;

public class Character {
  public static final int LEVEL_UP_FACTOR = 1_000;
  private static final int MAX_HEALTH = 1_000;
  private int health;
  private int level;
  private int receivedDamage;

  public Character() {
    health = 1000;
    level = 1;
  }

  public int health() {
    return health;
  }

  public void receiveDamage(int damage) {
    health = Math.max(0, health - damage);
    receivedDamage += damage;
    if (health > 0) {
      if (receivedDamage >= level * LEVEL_UP_FACTOR) {
        level++;
        receivedDamage = 0;
      }
    }
  }

  public int level() {
    return level;
  }

  public void heal(HealingMagicalObject healingMagicalObject) {
    if (health != MAX_HEALTH)
      health = Math.min(MAX_HEALTH, health + healingMagicalObject.health());
  }
}
