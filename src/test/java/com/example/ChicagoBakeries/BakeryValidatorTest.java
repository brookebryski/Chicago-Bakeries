package com.example.ChicagoBakeries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BakeryValidatorTest {
    @Test
    public void given1GetTrue() {
        // Given: I am a user
        BakeryValidator bv = new BakeryValidator();
        // When: I enter the string "1"
        boolean isBakery = bv.isBakery("1");
        // Then: I get back "true"
        assertTrue(isBakery);
    }

    @Test
    public void given5GetTrue() {
        // Given: I am a user
        BakeryValidator bv = new BakeryValidator();
        // When: I enter the string "5"
        boolean isBakery = bv.isBakery("5");
        // Then: I get back "true"
        assertTrue(isBakery);
    }

    @Test
    public void given10GetTrue() {
        // Given: I am a user
        BakeryValidator bv = new BakeryValidator();
        // When: I enter the string "10"
        boolean isBakery = bv.isBakery("10");
        // Then: I get back "true"
        assertTrue(isBakery);
    }

    @Test
    public void given0GetFalse() {
        // Given: I am a user
        BakeryValidator bv = new BakeryValidator();
        // When: I enter the string "0"
        boolean isBakery = bv.isBakery("0");
        // Then: I get back "false"
        assertFalse(isBakery);
    }

    @Test
    public void given11GetFalse() {
        // Given: I am a user
        BakeryValidator bv = new BakeryValidator();
        // When: I enter the string "11"
        boolean isBakery = bv.isBakery("11");
        // Then: I get back "false"
        assertFalse(isBakery);
    }
}
