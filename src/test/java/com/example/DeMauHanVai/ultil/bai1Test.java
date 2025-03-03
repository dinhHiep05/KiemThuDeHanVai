package com.example.DeMauHanVai.ultil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bai1Test {
    private bai1 bai1;
    @BeforeEach
    void setUp() {
        bai1 = new bai1();
    }

    @Test
    void dem() {
        assertEquals(80, bai1.dem());
    }
}