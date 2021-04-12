package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Theater extends Place {
    ArrayList<Movie> movies = new ArrayList<Movie>();
    ArrayList<String> moviesNames = new ArrayList<String>();

    public Theater(String name){
        this.name = name;
    };


    public  Theater(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name : ");
        this.name = input.next();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
        moviesNames.add(movie.name);
    }
    public void removeMovie(Movie movie){
        for (int i =0; i <  movies.size(); i++){
            if(movie == movies.get(i)){
                movies.remove(movies.get(i));
                moviesNames.remove(moviesNames.get(i));
                break;
            }
        }
    }

    public void updateMovie(Movie movie){
        for (int i =0; i <  movies.size(); i++){
            if(movie == movies.get(i)){
                movies.get(i).name = movie.name;
                movies.get(i).description = movie.description;
                moviesNames.set(i, movie.name);
                break;
            }
        }
    }

    public void addReview(MovieReview review,String movie){
        boolean notUpdateStarts = false;
        for (Review reviewInList : reviews){
            if(review == reviewInList){
                notUpdateStarts = true;
            }
        }
        reviews.add(review);
        if(notUpdateStarts == false)this.setNumberOfStars(review.getNumberOfStars());
        review.setPlace(this);
        review.setMovie(movie);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "movies names=" + moviesNames +
                '}';
    }
}
