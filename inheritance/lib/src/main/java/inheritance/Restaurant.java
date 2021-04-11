package inheritance;

import java.util.Scanner;

public class Restaurant extends Review implements Chain{
    String name;
    Double priceCategory;
    Review review ;

    public Restaurant(String name, int numberOfStars, Double priceCategory){
        this.name = name;
        this.priceCategory = priceCategory;
        Scanner input = new Scanner(System.in);
        while (numberOfStars  > 5 || numberOfStars < 0 ) {
            System.out.println("Number of stars should be between 0 and 5, enter new veiled number: ");
            numberOfStars = input.nextInt();
        }
        this.numberOfStars = numberOfStars;
    }

    public Restaurant(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the restaurant: ");
        this.name = input.next();

        System.out.println("Enter the price category of the restaurant: ");
        this.priceCategory = input.nextDouble();
    }

    public void addReview(Review review){
        if(review.body != this.body || review.body != this.review.body){
            this.setAuthor(review.getAuthor());
            this.setNumberOfStars(review.getNumberOfStars());
            this.setBody(review.getBody());
            this.review = review;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public Double getPriceCategory() {
        return priceCategory;
    }

    public void setPriceCategory(Double priceCategory) {
        this.priceCategory = priceCategory;
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", priceCategory=" + priceCategory +
                ", author=" + author +
                ", body=" + body +
                '}';
    }
}
