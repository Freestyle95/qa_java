package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
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

        assertEquals(expected,spy.eatMeat());
    }

    @Test
    public void getFamily() {
        String expected = "Кошачьи";
        assertEquals(expected,feline.getFamily());
    }

    @Test
    public void getKittens() {
        int expected = 999;

        Feline spy = spy(feline);
        when(spy.getKittens(1)).thenReturn(expected);

        assertEquals(expected,spy.getKittens());
    }
}