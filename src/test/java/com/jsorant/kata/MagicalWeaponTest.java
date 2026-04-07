package com.jsorant.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@UnitTest
public class MagicalWeaponTest {
  @Test
  void shouldHealthBeFixedWhenCreateMagicalWeapon() {
    assertThat(new MagicalWeapon(100).health()).isEqualTo(100);
  }
}
