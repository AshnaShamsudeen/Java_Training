package com.stackroute.collections;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


/*
This class contains a property called movieMap of type Map
This class contains methods for adding key-value pairs of Movie and its rating to HashMap and
various methods for accessing the keys and values based on some conditions
*/
public class MovieService {
Map<Movie, Integer> MovieMap = new LinkedHashMap();



/**
     * Constructor to create movieMap as an empty LinkedHashMap object
     */
public MovieService() {
}



/*
     * Returns the movieMap object
     */
public Map<Movie, Integer> getMovieMap() {
return MovieMap;}



/*
     * Add key-value pairs of Movie-Integer type and returns Set of Map.Entry
     */
public Set<Map.Entry<Movie, Integer>> addKeyValuePairsToMap(Movie movie, Integer rating) {
MovieMap.put(movie, rating);
return MovieMap.entrySet();}



/*
     * Return Set of movie names having rating greater than or equal to given rating
     */
public List<String> getHigherRatedMovieNames(int rating) {
List<String> HigherRatedMovie = new ArrayList<>();
for (Movie mov : MovieMap.keySet()) {
if (MovieMap.get(mov) >= rating) {
HigherRatedMovie.add(mov.getMovieName());
}
}
return HigherRatedMovie;}



/*
     * Return Set of movie names belonging to specific genre
     */
public List<String> getMovieNamesOfSpecificGenre(String genre) {
List<String> MovieNamesOfSpecificGenre = new ArrayList<>();
for (Movie mov : MovieMap.keySet()) {
if (mov.getGenre().equalsIgnoreCase(genre)) {
MovieNamesOfSpecificGenre.add(mov.getMovieName());
}
}
return MovieNamesOfSpecificGenre;}



/*
     * Return Set of movie names which are released after Specific releaseDate and
     * having rating less than or equal to 3
     */



public List<String> getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(LocalDate releaseDate) {
List<String> filteredMovies = new ArrayList<>();
for (Movie mov : MovieMap.keySet()) {
if (mov.getReleaseDate().isAfter(releaseDate) && MovieMap.get(mov) <= 3) {
filteredMovies.add(mov.getMovieName());
}
}
return filteredMovies;}



/*
     * Return set of movies sorted by release dates in ascending order. Hint: Use
     * TreeMap
     */
public List<Movie> getSortedMovieListByReleaseDate() {
List<Movie> MovieData = new LinkedList<>();
Comparator<Movie> com = (m1, m2) -> m1.getReleaseDate().compareTo(m2.getReleaseDate());
        TreeMap<Movie, Integer> sortedMovieList = new TreeMap<>(com);
for (Movie mov : MovieMap.keySet()) {
sortedMovieList.put(mov, MovieMap.get(mov));
}



for (Movie movie : sortedMovieList.keySet()) {
MovieData.add(movie);
}
return MovieData;}



 /*
     * Return set of movies sorted by rating. Hint: Use Comparator and LinkedHashMap
     */
public Map<Movie, Integer> getSortedMovieListByRating() {
ArrayList<Entry<Movie, Integer>> movieData = new ArrayList<>(MovieMap.entrySet());
Collections.sort(movieData, (mov, mov2) -> {
return ((Comparable) ((Map.Entry) (mov)).getValue()).compareTo(((Map.Entry) (mov2)).getValue());
});



 HashMap data = new LinkedHashMap();
Iterator it = movieData.iterator();
while (it.hasNext()) {
Map.Entry entry = (Map.Entry) it.next();



data.put(entry.getKey(), entry.getValue());
}
return data;}
}
