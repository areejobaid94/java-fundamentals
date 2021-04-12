package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant extends Place implements Chain{
    Double priceCategory;

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
    }

    public void addRestaurantFromT(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the restaurant: ");
        this.name = input.next();

        System.out.println("Enter the price category of the restaurant: ");
        this.priceCategory = input.nextDouble();

        while (numberOfStars  > 5 || numberOfStars < 0 ){
            System.out.println("Number of stars should be between 0 and 5, enter new veiled number: ");
            numberOfStars = input.nextInt();
        }
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
                "Name='" + name +
                ", Number Of Stars=" + numberOfStars +
                ", Price Category=" + priceCategory +
                ", All Reviews= "  + this.reviews +
                '}';
    }
}
