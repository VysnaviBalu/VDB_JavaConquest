package org.example.inheritance;

import org.example.inheritance.domain.AnimalDogEnter;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
@DisplayName("Dog")
public class AnimalDogTest {
    private AnimalDogEnter dog;

    @BeforeEach
    void setup(){
        dog = new AnimalDogEnter("Rex", "Labrador");
    }

    @Test
    @DisplayName("has correct species")
    void species(){
        assertThat(dog.getSpecies())
                .isEqualTo("Canis lupus familiaris");
    }

    @Test
    @DisplayName("makes sound Woof")
    void sound(){
        assertThat(dog.makeSound()).isEqualTo("woof");
    }

    @Test
    @DisplayName("increments fetch count")
    void fetch(){
        dog.fetch("ball");
        dog.fetch("stick");
        assertThat(dog.getFetchCount()).isEqualTo(2);
    }

    @Test
    @DisplayName("rejects blank name")
    void blankName(){
        assertThatThrownBy(() ->
                new AnimalDogEnter("", "Poodle"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
