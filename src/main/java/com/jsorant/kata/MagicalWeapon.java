package com.jsorant.kata;

public class MagicalWeapon {
  private int health;
  private int damage;

  public MagicalWeapon(int health, int damage) {
    this.health = health;
    this.damage = damage;
  }

  public int health() {
    return health;
  }

  public int damage() {
    return damage;
  }

  public int use() {
    health--;
    return damage();
  }
}
