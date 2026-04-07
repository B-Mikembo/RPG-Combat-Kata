package com.jsorant.kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@UnitTest
public class CharacterTest {
  @Test
  void shouldHealthBe1000WhenCreateNewCharacter() {
    assertThat(new Character().health()).isEqualTo(1000);
  }

  @Test
  void shouldLevelBeOneWhenCreateNewCharacter() {
    assertThat(new Character().level()).isEqualTo(1);
  }

  @Test
  void shouldReduceHealthWhenCharacterReceiveDamage() {
    var character = new Character();
    character.receiveDamage(500);
    assertThat(character.health()).isEqualTo(500);
  }
}
