package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int kittens;
    Feline feline = new Feline();

    public FelineParameterizedTest(int kittens) {
        this.kittens = kittens;
    }

    @Parameterized.Parameters(name = "Количество котят: {0}")
    public static Object[] getKittensData() {
        return new Object[]{
                3,
                100
        };
    }

    @Test
    public void testGetKittens() {
        assertEquals("Возвращено неверное количество котят", kittens, feline.getKittens(kittens));
    }
}