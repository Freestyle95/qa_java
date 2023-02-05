package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    private final String animalKind;
    private final List<String> foodListExpected;
    Animal animal = new Animal();

    public AnimalParameterizedTest(String animalKind, List<String> foodList) {
        this.animalKind = animalKind;
        this.foodListExpected = foodList;
    }

    @Parameterized.Parameters(name = "Тип животного: {0}; Ожидаемый список: {1}")
    public static Object[][] getFoodData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},};
    }

    @Test
    public void getFood() throws Exception {
        assertEquals("Возвращен неверный список пищи", foodListExpected, animal.getFood(animalKind));
    }
}