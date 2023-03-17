package ru.netology.java.qa;

public class Poster {
    private String[] movies = new String[0];
    private int limit;

    public Poster() {
        this.limit = 10;
    }

    public Poster(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];

        }
        tmp[tmp.length - 1] = movie;

        movies = tmp;
    }

    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int resultLength;
        if (movies.length > 10) {
            resultLength = movies.length;
        } else {
            resultLength = 10;
        }
        return movies;


    }
}
