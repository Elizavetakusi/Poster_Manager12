package ru.netology.java.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {
    @Test
    public void testAddAll() {
        Poster manager = new Poster();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testNoAdd() {
        Poster manager = new Poster();


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testAddFilm1() {
        Poster manager = new Poster();
        manager.add("Film1");
        String[] expected = {"Film1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }
}
