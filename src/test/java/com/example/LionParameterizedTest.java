package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean hasManeExpected;
    Lion lion;
    @Mock
    Feline feline;

    public LionParameterizedTest(String sex, boolean hasManeExpected) {
        this.sex = sex;
        this.hasManeExpected = hasManeExpected;
    }

    @Parameterized.Parameters(name = "Пол: {0}; Есть грива: {1}")
    public static Object[][] getLionData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
        lion = new Lion(feline, sex);
    }

    @Test
    public void constructLion() {
        assertEquals("Возвращено неверное значение hasMane", hasManeExpected, lion.hasMane());

    }

    @Test
    public void doesHaveMane() {
        assertEquals("Возвращено неверное значение hasMane", hasManeExpected, lion.doesHaveMane());
    }
}