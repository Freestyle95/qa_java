package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class FelineTest {

    @Mock
    Feline felineMock;
    Feline feline;


    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        feline = new Feline();
    }

    @Test
    public void eatMeat() throws Exception {
        List<String> expected = List.of("Mocked");

        Feline spy = spy(feline);
        when(spy.getFood("Хищник")).thenReturn(expected);

        assertEquals("Не был вызван метод getFood()", expected, spy.eatMeat());
    }

    @Test
    public void getFamily() {
        assertEquals("Возвращен неверный вид животного", "Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        int expected = 999;

        Feline spy = spy(feline);
        when(spy.getKittens(1)).thenReturn(expected);

        assertEquals("Не был вызван метод getKittens(1)", expected, spy.getKittens());
    }
}