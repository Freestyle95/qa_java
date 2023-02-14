package com.example;

import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;

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
        assertEquals("Возвращен неверный список друзей Алекса", List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() {
        assertEquals("Возвращен неверный город проживания Алекса", "Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void getKittens() {
        assertEquals("Возвращено неверное количество котят Алекса", 0, alex.getKittens());
    }
}