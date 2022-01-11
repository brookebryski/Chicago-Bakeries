package com.example.ChicagoBakeries;

import org.junit.jupiter.api.Test;

public class BakeryValidatorTest {
    @Test
    public void given1GetTrue() {
        // Given: I am a user
        // When: I enter the string "1"
        // Then: I get back "true"
    }

    @Test
    public void given5GetTrue() {
        // Given: I am a user
        // When: I enter the string "5"
        // Then: I get back "true"
    }

    @Test
    public void given10GetTrue() {
        // Given: I am a user
        // When: I enter the string "10"
        // Then: I get back "true"
    }

    @Test
    public void given0GetFalse() {
        // Given: I am a user
        // When: I enter the string "0"
        // Then: I get back "false"
    }

    @Test
    public void given11GetFalse() {
        // Given: I am a user
        // When: I enter the string "11"
        // Then: I get back "false"
    }
}
