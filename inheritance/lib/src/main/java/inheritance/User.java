package inheritance;

import java.util.Scanner;

public class User {
    String author;
    Double authorAge;

    public  User(String author, Double authorAge){
        this.author = author;
        this.authorAge = authorAge;
    }

    public User(){
    }

    public void addUserDataFromTheTiaminal(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the author name of the review: ");
        this.author = input.next();

        System.out.println("Enter the author age of the review: ");
        this.authorAge = input.nextDouble();
    }

    public void setAuthorAge(Double authorAge) {
        this.authorAge = authorAge;
    }

    public String getAuthor() {
        return author;
    }

    public Double getAuthorAge() {
        return authorAge;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
