package com.example.ChicagoBakeries;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class FlowControlTest {
    private IBakeryValidator _bakeryValidator;
    private IBakery _bakery;
    private IFlowControl _flowControl;

    @BeforeEach
    public void setup() {
        this._bakeryValidator = mock(BakeryValidator.class);
        this._bakery = mock(Bakery.class);
        this._flowControl = new FlowControl(_bakeryValidator, _bakery);
    }

    @Test
    public void given1CallBakeryOnce() {
        // Given: I am a user
        when(_bakeryValidator.isBakery("1")).thenReturn(true);
        when(_bakery.generateBakeries("1")).thenReturn(anyString());
        _flowControl.run("1");
        // When: I enter the string "1"
        // Then: Call Bakery() once
        verify(_bakery, times(1)).generateBakeries("1");
    }

    @Test
    public void givenBobCallIsBakeryOnce() {
        // Given: I am a user
        // When: I enter the string "Bob
        when(_bakeryValidator.isBakery("bob")).thenReturn(false);
        _flowControl.run("bob");
        // Then: Call isBakery() once
        verify(_bakeryValidator, times(1)).isBakery("bob");
    }

    @Test
    public void givenBobDoNotCallBakery() {
        // Given: I am a user
        // When: I enter the string "Bob"
        when(_bakery.generateBakeries(anyString())).thenReturn(anyString());
        _flowControl.run("bob");
        // Then: Call Bakery() zero times
        verify(_bakery, never()).generateBakeries(anyString());
    }
}
