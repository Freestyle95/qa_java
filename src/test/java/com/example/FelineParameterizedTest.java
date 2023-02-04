package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    Feline feline = new Feline();
    private final int kittens;

    public FelineParameterizedTest(int kittens) {
        this.kittens = kittens;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[] getKittensData() {
        return new Object[]{
                3,
                100
        };
    }

    @Test
    public void testGetKittens() {
        assertEquals(kittens, feline.getKittens(kittens));
    }
}