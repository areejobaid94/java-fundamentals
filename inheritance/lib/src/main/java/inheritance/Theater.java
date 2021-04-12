package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Theater extends Place {
    // The properties
    ArrayList<Movie> movies = new ArrayList<Movie>();
    ArrayList<String> moviesNames = new ArrayList<String>();

    public Theater(String name){
        super.setName(name);
    };

    // The default constructor.
    public  Theater(){

    }

    // =>  if there is no arg => take the values from the terminal as input.
    public void addTheaterFromT(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name : ");
        super.setName(input.next());
    }

    // add New Movie
    public void addMovie(Movie movie){
        movies.add(movie);
        moviesNames.add(movie.getName());
    }

    // remove Movie
    public void removeMovie(Movie movie){
        for (int i =0; i <  movies.size(); i++){
            if(movie == movies.get(i)){
                movies.remove(movies.get(i));
                moviesNames.remove(moviesNames.get(i));
                break;
            }
        }
    }

    // update Movie
    public void updateMovie(Movie movie){
        for (int i =0; i <  movies.size(); i++){
            if(movie == movies.get(i)){
                movies.get(i).setName(movie.getName());
                movies.get(i).setDescription(movie.getDescription());
                moviesNames.set(i, movie.getName());
                break;
            }
        }
    }

    // update Review Method
    @Override
    public void addReview(Review review){
        boolean notUpdateStarts = false;
        for (Review reviewInList : reviews){
            if(review == reviewInList){
                notUpdateStarts = true;
            }
        }
        reviews.add(review);
        if(notUpdateStarts == false)this.setNumberOfStars(review.getNumberOfStars());
        review.setPlace(this);
    }

    // Override toString Method
    @Override
    public String toString() {
        return "Theater{" +
                "movies names=" + moviesNames +
                '}';
    }
}
