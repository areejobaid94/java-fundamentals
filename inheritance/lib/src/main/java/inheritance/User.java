package inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class User {
    private String author;
    private Double authorAge;
    private ArrayList<Review> reviews = new ArrayList<Review>();

    public  User(String author, Double authorAge){
        this.author = author;
        this.authorAge = authorAge;
    }

    // The default constructor =>  if there is no arg => take the values from the terminal as input.
    public User(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the author : ");
        this.author = input.next();
        System.out.println("Enter the author age : ");
        this.authorAge = input.nextDouble();
    }

    // if there is no arg => take the values from the terminal as input.
    public void addUserDataFromTheTiaminal(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the author name of the review: ");
        this.author = input.next();

        System.out.println("Enter the author age of the review: ");
        this.authorAge = input.nextDouble();
    }

    // User add review Method
    public String addReview(Review review){
        for(Review rev : this.reviews){
            if (rev.place != null && review.place == review.place){
             return "you can't add new review for " +review.place.getName();
            }
        }
        this.reviews.add(review);
        review.setAuthor(this.getAuthor());
        return "The review has been added";
    }

    // all getters
    public String getAuthor() {
        return author;
    }

    public Double getAuthorAge() {
        return authorAge;
    }

    // all setters
    public void setAuthorAge(Double authorAge) {
        this.authorAge = authorAge;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Override toString Method
    @Override
    public String toString() {
        return "User{" +
                "author='" + author + '\'' +
                ", authorAge=" + authorAge +
                ", reviews=" + reviews +
                '}';
    }
}
