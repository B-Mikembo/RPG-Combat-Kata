package com.jsorant.kata;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@UnitTest
public class CharacterTest {

  @Test
  void shouldHealthBe1000WhenCreateNewCharacter() {
    assertThat(new Character().health()).isEqualTo(1000);
  }

  @Nested
  class Leveling {
    @Test
    void shouldLevelBeOneWhenCreateNewCharacter() {
      assertThat(new Character().level()).isEqualTo(1);
    }

    @Test
    void shouldNotLevelUpToLevelTwoWhenNotReceiveOneThousandDamage() {
      var character = new Character();

      character.receiveDamage(999);

      assertThat(character.level()).isEqualTo(1);
    }
  }

  @Nested
  class Damage {
    @Test
    void shouldReduceHealthWhenCharacterReceiveDamage() {
      var character = new Character();
      character.receiveDamage(500);
      assertThat(character.health()).isEqualTo(500);
    }
  }

  @Nested
  class Healing {
    @Test
    void shouldBeHealedWhenHealWithHealingMagicalObject() {
      var character = new Character();
      character.receiveDamage(500);

      character.heal(new HealingMagicalObject(100));

      assertThat(character.health()).isEqualTo(600);
    }

    @Test
    void shouldNotBeHealedWhenHealMaximumHealth() {
      var character = new Character();

      character.heal(new HealingMagicalObject(100));

      assertThat(character.health()).isEqualTo(1000);
    }

    @Test
    void shouldBeHealedUpToMaximumHealthWhenHeal() {
      var character = new Character();
      character.receiveDamage(50);

      character.heal(new HealingMagicalObject(100));

      assertThat(character.health()).isEqualTo(1000);
    }
  }
}
