package com.example;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class CatTest {

    Cat cat;
    @Mock
    Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        cat = new Cat(feline);
    }

    @org.junit.Test
    public void getSound() {
        assertEquals("Возвращен неверный тип издаваемого звука", "Мяу", cat.getSound());
    }

    @org.junit.Test
    public void getFood() throws Exception {
        cat.getFood();
        Mockito.verify(feline, Mockito.times(1)).eatMeat();
    }
}