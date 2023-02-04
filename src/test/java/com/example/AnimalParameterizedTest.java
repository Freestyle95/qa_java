package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    Animal animal = new Animal();

    private final String animalKind;
    private final List<String> foodListExpected;

    public AnimalParameterizedTest(String animalKind, List<String> foodList) {
        this.animalKind = animalKind;
        this.foodListExpected = foodList;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getFoodData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},};
    }

    @Test
    public void getFood() throws Exception {
        assertEquals(foodListExpected, animal.getFood(animalKind));
    }
}