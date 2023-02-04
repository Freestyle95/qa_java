package com.example;

import junit.framework.AssertionFailedError;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    Animal animal = new Animal();

    @Test
    public void getFamily() {
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    @Test
    public void getFoodException() {
        try {
            animal.getFood("sth");
            throw new AssertionFailedError("Unexpected line processed");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }
}