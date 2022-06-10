package com.exam.exam1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest1 {
    @Test
    public void _1_Plus_1() {
        assertEquals(new Calc().run("1 + 1"), 2);
    }

    @Test
    public void _1_Plus_2() {
        assertEquals(new Calc().run("1 + 2"), 3);
    }

    @Test
    public void _1_Minus_1() {
        assertEquals(new Calc().run("1 - 1"), 0);
    }

    @Test
    public void _2_Minus_1() {
        assertEquals(new Calc().run("2 - 1"), 1);
    }

    @Test
    public void _1_Multi_1() {
        assertEquals(new Calc().run("1 * 1"), 1);
    }

    @Test
    public void _2_Multi_1() {
        assertEquals(new Calc().run("2 * 1"), 2);
    }

    @Test
    public void _1_Devide_1() {
        assertEquals(new Calc().run("1 / 1"), 1);
    }

    @Test
    public void _2_Devide_1() {
        assertEquals(new Calc().run("2 / 1"), 2);
    }

    @Test
    public void bra_2_Plus_1() {
        assertEquals(new Calc().run("(2 + 1)"), 3);
    }

    @Test
    public void bra_2_Minus_1() {
        assertEquals(new Calc().run("(2 - 1)"), 1);
    }

    @Test
    public void bra_2_Multi_1() {
        assertEquals(new Calc().run("(2 * 1)"), 2);
    }

    @Test
    public void bra_2_Devide_1() {
        assertEquals(new Calc().run("(2 / 1)"), 2);
    }
}
