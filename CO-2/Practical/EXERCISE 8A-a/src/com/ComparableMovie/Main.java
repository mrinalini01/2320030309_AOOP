package com.ComparableMovie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(8.5, "Inception", 2010));
        movies.add(new Movie(9.0, "The Dark Knight", 2008));
        movies.add(new Movie(7.5, "Interstellar", 2014));
        movies.add(new Movie(8.0, "Dunkirk", 2017));

        System.out.println("Movies before sorting:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        Collections.sort(movies);

        System.out.println("\nMovies after sorting by year:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
