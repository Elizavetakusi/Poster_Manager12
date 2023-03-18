package ru.netology.java.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {
    @Test
    public void testAddAll() {
        PosterManager manager = new PosterManager();
        manager.add("Film1");
        manager.add("Film2");
        manager.add("Film3");
        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testNoAdd() {
        PosterManager manager = new PosterManager();


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void testAddFilm1() {
        PosterManager manager = new PosterManager();
        manager.add("Film1");
        String[] expected = {"Film1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);


    }
    @Test
    public void WhenTheLengthIsEqualToTheLimit() {
        PosterManager manager = new PosterManager();
        manager.add("Film 1");
        manager.add("Film 2");
        manager.add("Film 3");
        manager.add("Film 4");
        manager.add("Film 5");
        manager.add("Film 6");
        manager.add("Film 7");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");


        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
