package com.jsorant.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@UnitTest
public class MagicalWeaponTest {
  @Test
  void shouldHealthBeFixedWhenCreateMagicalWeapon() {
    assertThat(new MagicalWeapon(100, 50).health()).isEqualTo(100);
  }

  @Test
  void shouldDamageBeFixedWhenCreateMagicalWeapon() {
    assertThat(new MagicalWeapon(100, 50).damage()).isEqualTo(50);
  }

  @Test
  void shouldReduceHealthWhenDealDamage() {
    var magicalWeapon = new MagicalWeapon(100, 50);

    magicalWeapon.damage();

    assertThat(magicalWeapon.health()).isEqualTo(99);
  }
}
