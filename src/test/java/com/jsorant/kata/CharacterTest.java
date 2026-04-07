package com.jsorant.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@UnitTest
public class CharacterTest {
  @Test
  void shouldHealthBe1000WhenCreateNewCharacter() {
    assertThat(new Character().health()).isEqualTo(1000);
  }
}
