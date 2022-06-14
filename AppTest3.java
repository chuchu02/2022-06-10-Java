package com.exam.exam1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest3 {
    @Test
    public void _1_더하기_1() {
        assertEquals(2, new Calc().run("1 + 1"));
    }
    @Test
    public void _1_더하기_2() {
        assertEquals(3, new Calc().run("1 + 2"));
    }
    @Test
    public void _1_빼기_1() {
        assertEquals(-0, new Calc().run("1 - 1"));
    }
    @Test
    public void _1_빼기_2() {
        assertEquals(-1, new Calc().run("1 - 2"));
    }
    @Test
    public void _1_곱하기_1() {
        assertEquals(1, new Calc().run("1 * 1"));
    }
    @Test
    public void _1_곱하기_2() {
        assertEquals(2, new Calc().run("1 * 2"));
    }
    @Test
    public void _2_나누기_1() {
        assertEquals(2, new Calc().run("2 / 1"));
    }
    @Test
    public void _2_나누기_2() {
        assertEquals(1, new Calc().run("2 / 2"));
    }
    @Test
    public void 괄호_1_더하기_1() {
        assertEquals(2, new Calc().run("(1 + 1)"));
    }
    @Test
    public void 이중괄호_1_더하기_2() {
        assertEquals(3, new Calc().run("((1 + 2))"));
    }
    @Test
    public void 복합_5_곱하기_3_더하기_2() {
        assertEquals(17, new Calc().run("5 * 3 + 2"));
    }
    @Test
    public void 복합_5_곱하기_3_더하기_1() {
        assertEquals(16, new Calc().run("5 * 3 + 1"));
    }
    @Test
    public void 복합_5_더하기_3_곱하기_2() {
        assertEquals(11, new Calc().run("5 + 3 * 2"));
    }
    @Test
    public void 복합_5_더하기_3_곱하기_3() {
        assertEquals(14, new Calc().run("5 + 3 * 3"));
    }
    @Test
    public void 괄호복합_5_곱하기_3_괄호더하기_2() {
        assertEquals(25, new Calc().run("5 * (3 + 2)"));
    }
    @Test
    public void 복합연산__괄호열기_1_더하기_4_괄호닫기_곱하기_2() {
        assertEquals(10, new Calc().run("(1 + 4) * 2"));
    }
    @Test
    public void 복합연산__괄호열기_10_빼기_6_괄호닫기_나누기_2() {
        assertEquals(2, new Calc().run("(10 - 6) / 2"));
    }
    @Test
    public void 음수더하기__음수1_더하기_음수1() {
        assertEquals(-2, new Calc().run("-1 + -1"));
    }
    @Test
    public void 음수더하기__음수1_더하기_음수1_더하기_음수1_더하기_음수1() {
        assertEquals(-4, new Calc().run("-1 + -1 + -1 + -1"));
    }
}
