package com.javaunit3.springmvc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
public class MovieApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MovieApp.class);

        BestMovieService bestMovieService = applicationContext.getBean("bestMovieService", BestMovieService.class);

        Movie bestMovie = bestMovieService.getBestMovie();

        System.out.printf("The title of the movie is '%s' of the %s genre, and it has a maturity rating of %s",
                bestMovie.getTitle(), bestMovie.getGenre(), bestMovie.getMaturityRating());
    }
}
