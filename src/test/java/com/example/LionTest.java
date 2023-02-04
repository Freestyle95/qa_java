package com.example;

import junit.framework.AssertionFailedError;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class LionTest {

    Lion lion;
    @Mock
    Feline feline;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
        lion = new Lion(feline,"Самец");
    }

    @Test
    public void getKittens() {
        lion.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void getFood() throws Exception {
        lion.getFood();
        Mockito.verify(feline,Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void constructorException() {
        try {
            Lion newLion = new Lion(feline,"sth");
            throw new AssertionFailedError("Unexpected line processed");
        }catch (Exception e){
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }
}