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

    Lion lion;
    @Mock
    Feline feline;

    private final String sex;
    private final boolean hasManeExpected;

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getLionData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
        };
    }


    public LionParameterizedTest(String sex, boolean hasManeExpected) {
        this.sex = sex;
        this.hasManeExpected = hasManeExpected;
    }


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
        lion = new Lion(feline,sex);
    }

    @Test
    public void constructLion(){
        boolean actual = lion.hasMane;
        assertEquals(hasManeExpected,actual);

    }

    @Test
    public void doesHaveMane() {
        boolean actual = lion.doesHaveMane();
        assertEquals(hasManeExpected,actual);
    }
}