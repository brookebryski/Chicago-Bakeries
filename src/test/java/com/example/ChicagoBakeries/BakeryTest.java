package com.example.ChicagoBakeries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BakeryTest {
    @Test
    public void given1GetTousLesJours() {
        Bakery bakery = new Bakery();
        // Given: I am a user
        String result = bakery.generateBakeries("1");
        // When: I enter the string "1"
        assertEquals("Tous Les Jours", result);
        // Then: I get back the string "Tous Les Jours"
    }

    @Test
    public void given5GetAyaPastry() {
        Bakery bakery = new Bakery();
        // Given: I am a user
        String result = bakery.generateBakeries("5");
        // When: I enter the string "5"
        assertEquals("Aya Pastry", result);
        // Then: I get back the string "Aya Pastry"
    }

    @Test
    public void given9GetBjornCakes() {
        Bakery bakery = new Bakery();
        // Given: I am a user
        String result = bakery.generateBakeries("9");
        // When: I enter the string "9"
        assertEquals("Bjorn Cakes", result);
        // Then: I get back the string "Bjorn Cakes"
    }

    @Test
    public void given10GetMarkellosBakingCompany() {
        Bakery bakery = new Bakery();
        // Given: I am a user
        String result = bakery.generateBakeries("10");
        // When: I enter the string "10"
        assertEquals("Markellos Baking Company", result);
        // Then: I get back the string "Markellos Baking Company"
    }
}
