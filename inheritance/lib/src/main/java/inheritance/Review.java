package inheritance;

import java.util.Scanner;

public class Review {
    // The properties
    protected String author;
    protected String body;
    protected int numberOfStars = -1;
    protected Place place;

    public Review(String  body,String author,int numberOfStars){
        this.body = body;
        this.author = author;
        Scanner input = new Scanner(System.in);
        while (numberOfStars  > 5 || numberOfStars < 0 ) {
            System.out.println("Number of stars should be between 0 and 5, enter new veiled number: ");
            numberOfStars = input.nextInt();
        }
        this.numberOfStars = numberOfStars;
    }

    // The default constructor =>  if there is no arg => take the values from the terminal as input.
    public Review(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the author : ");
        this.author = input.next();
        System.out.println("Enter the body : ");
        this.body = input.next();
        while (numberOfStars  > 5 || numberOfStars < 0 ){
            System.out.println("Number of stars should be between 0 and 5, enter new veiled number: ");
            numberOfStars = input.nextInt();
        }
    }

    // take the values from the terminal as input.
    public void addReviewFromT(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the author : ");
        this.author = input.next();
        System.out.println("Enter the body : ");
        this.body = input.next();
        while (numberOfStars  > 5 || numberOfStars < 0 ){
            System.out.println("Number of stars should be between 0 and 5, enter new veiled number: ");
            numberOfStars = input.nextInt();
        }
    }

    // update num of Stars Method.
    public void updateStars(int numberOfStars){
        this.setNumberOfStars(numberOfStars);
        if(place != null){
            place.setNumberOfStars(numberOfStars);
        }
    }

    // all getters.
    public Place getPlace() {
        return place;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    // all setters.
    public void setPlace(Place place) {
        this.place = place;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    // Override toString Method
    @Override
    public String toString() {
        String output = "Review{" +
                "Body='" +this.body + '\'' +
                ", Number Of Stars=" +this.numberOfStars +
                ", Author='" + this.author +
                '}';

        if(place != null){
            output = "Review{" +
                    "Body='" + this.body + '\'' +
                    ", Number Of Stars=" + this.numberOfStars +
                    ", Author='" + this.author +
                    ", Place Name='" + this.place.getName() +
                    '}';
        }
        return output;
    }
}
