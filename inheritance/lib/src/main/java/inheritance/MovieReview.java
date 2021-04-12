package inheritance;

import java.util.Scanner;

public class MovieReview extends Review {
    // The properties
    private String movie;

    public MovieReview(String  body,String author,int numberOfStars, String movie){
        super(body,author,numberOfStars);
        this.movie = movie;
        Scanner input = new Scanner(System.in);
        while (numberOfStars  > 5 || numberOfStars < 0 ) {
            System.out.println("Number of stars should be between 0 and 5, enter new veiled number: ");
            numberOfStars = input.nextInt();
        }
        this.numberOfStars = numberOfStars;
    }

    // The default constructor =>  if there is no arg => take the values from the terminal as input.
    public MovieReview(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the author : ");
        this.author = input.next();
        System.out.println("Enter the body : ");
        this.body = input.next();
        System.out.println("Enter the movie name: ");
        this.movie = input.next();
        while (numberOfStars  > 5 || numberOfStars < 0 ){
            System.out.println("Number of stars should be between 0 and 5, enter new veiled number: ");
            numberOfStars = input.nextInt();
        }
    }

    // all getters.
    public String getMovie() {
        return movie;
    }

    // all setters.
    public void setMovie(String movie) {
        this.movie = movie;
    }



    // Override toString Method
    @Override
    public String toString() {
        String output = "MovieReview{" +
                "movie='" + movie + '\'' +
                ", Body='" + body +
                ", Number Of Stars=" + numberOfStars +
                ", Author='" + author +
                '}';

        if(place != null){
            output =  "MovieReview{" +
                    "movie='" + movie + '\'' +
                    ", Body='" + body +
                    ", Number Of Stars=" + numberOfStars +
                    ", Author='" + author +
                    ", Place Name='" + place.getName() +
                    '}';
        }
        return output;
    }
}
