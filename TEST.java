package com.exam.exam1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TEST {
    @Test
    public void _1_더하기_1() {
        assertEquals(2, new Calc5().run("1 + 1"));
    }
    @Test
    public void _1_더하기_2() {
        assertEquals(3, new Calc5().run("1 + 2"));
    }
    @Test
    public void _1_빼기_1() {
        assertEquals(-0, new Calc5().run("1 - 1"));
    }
    @Test
    public void _1_빼기_2() {
        assertEquals(-1, new Calc5().run("1 - 2"));
    }
    @Test
    public void _1_곱하기_1() {
        assertEquals(1, new Calc5().run("1 * 1"));
    }
    @Test
    public void _1_곱하기_2() {
        assertEquals(2, new Calc5().run("1 * 2"));
    }
    @Test
    public void _2_나누기_1() {
        assertEquals(2, new Calc5().run("2 / 1"));
    }
    @Test
    public void _2_나누기_2() {
        assertEquals(1, new Calc5().run("2 / 2"));
    }
    @Test
    public void 괄호_1_더하기_1() {
        assertEquals(2, new Calc5().run("(1 + 1)"));
    }
    @Test
    public void 이중괄호_1_더하기_2() {
        assertEquals(3, new Calc5().run("((1 + 2))"));
    }
    @Test
    public void 복합_5_곱하기_3_더하기_2() {
        assertEquals(17, new Calc5().run("5 * 3 + 2"));
    }
    @Test
    public void 복합_5_곱하기_3_더하기_1() {
        assertEquals(16, new Calc5().run("5 * 3 + 1"));
    }
    @Test
    public void 복합_5_더하기_3_곱하기_2() {
        assertEquals(11, new Calc5().run("5 + 3 * 2"));
    }
    @Test
    public void 복합_5_더하기_3_곱하기_3() {
        assertEquals(14, new Calc5().run("5 + 3 * 3"));
    }
    @Test
    public void 괄호복합_5_곱하기_3_괄호더하기_2() {
        assertEquals(25, new Calc5().run("5 * (3 + 2)"));
    }

}
