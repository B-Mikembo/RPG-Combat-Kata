package com.jsorant.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@UnitTest
public class HealingMagicalObjectTest {
  @Test
  void shouldHealthBeFixedWhenCreateHealingMagicalObject() {
    assertThat(new HealingMagicalObject(500).health()).isEqualTo(500);
  }
}
