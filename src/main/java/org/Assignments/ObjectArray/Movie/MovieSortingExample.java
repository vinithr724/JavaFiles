package org.Assignments.ObjectArray.Movie;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieSortingExample {

    public static void main(String[] args) {
        List<Movie> movieList = new ArrayList<>();

        // Adding movies to the list
        movieList.add(new Movie(2000, 8.5, 50.0, 120.0));
        movieList.add(new Movie(2010, 7.8, 80.0, 150.0));
        movieList.add(new Movie(2005, 8.0, 60.0, 130.0));

        // Sorting the list of movies based on rating and profit
        movieList.sort(Comparator.comparingDouble(Movie::getRating).reversed()
                .thenComparingDouble(movie -> movie.getCollectionAmount() - movie.getBudget()).reversed());

        // Displaying the sorted list
        System.out.println("Sorted Movies based on Rating and Profit:");
        movieList.forEach(movie -> System.out.println(movie.getYearReleased() + " - Rating: " + movie.getRating() +
                " - Profit: " + (movie.getCollectionAmount() - movie.getBudget())));

        // Sorting the list of movies based on yearReleased and rating
        movieList.sort(Comparator.comparingInt(Movie::getYearReleased)
                .thenComparingDouble(Movie::getRating).reversed());

        // Displaying the sorted list
        System.out.println("\nSorted Movies based on Year and Rating:");
        movieList.forEach(movie -> System.out.println(movie.getYearReleased() + " - Rating: " + movie.getRating()));
    }
}