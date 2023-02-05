package com.example;

import junit.framework.AssertionFailedError;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    Animal animal = new Animal();

    @Test
    public void getFamily() {
        assertEquals("Список семейств неверный", "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    @Test
    public void getFoodException() {
        try {
            animal.getFood("sth");
            throw new AssertionFailedError("Не сработал Exception на неизвестный вид животного");
        } catch (Exception e) {
            assertEquals("Сообщение об ошибке неверное", "Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }
}