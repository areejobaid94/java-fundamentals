package inheritance;

import java.util.Scanner;

public class Review {
    String author;
    String body;
    int numberOfStars = -1;
    Place place;

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        String output = "Review{" +
                "Body='" + body + '\'' +
                ", Number Of Stars=" + numberOfStars +
                ", Author='" + author +
                '}';

        if(place != null){
            output = "Review{" +
                    "Body='" + body + '\'' +
                    ", Number Of Stars=" + numberOfStars +
                    ", Author='" + author +
                    ", Place Name='" + place.name +
                    '}';
        }
        return output;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public void updateStars(int numberOfStars){
        this.setNumberOfStars(numberOfStars);
        if(place != null){
            place.setNumberOfStars(numberOfStars);
        }
    }
}
