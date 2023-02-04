package com.example;

import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.*;

public class AlexFromMadagascarTest {

    @Mock
    Feline feline;
    AlexFromMadagascar alex;
    {
        try {
            alex = new AlexFromMadagascar(feline);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getFriends() {
        assertEquals(List.of("Марти", "Глория", "Мелман"),alex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() {
        assertEquals("Нью-Йоркский зоопарк",alex.getPlaceOfLiving());
    }

    @Test
    public void getKittens() {
        assertEquals(0,alex.getKittens());
    }
}