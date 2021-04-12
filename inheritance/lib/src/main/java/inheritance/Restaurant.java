package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant extends Place implements Chain{
    // The properties
    private Double priceCategory;

    public Restaurant(String name, int numberOfStars, Double priceCategory){
        super.setName(name);
        this.priceCategory = priceCategory;
        Scanner input = new Scanner(System.in);
        while (numberOfStars  > 5 || numberOfStars < 0 ) {
            System.out.println("Number of stars should be between 0 and 5, enter new veiled number: ");
            numberOfStars = input.nextInt();
        }
        super.numberOfStars = numberOfStars;
    }

    // The default constructor =>  if there is no arg => take the values from the terminal as input.
    public Restaurant(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the restaurant: ");
        setName(input.next());

        System.out.println("Enter the price category of the restaurant: ");
        this.priceCategory = input.nextDouble();

        while (numberOfStars  > 5 || numberOfStars < 0 ) {
            System.out.println("Number of stars should be between 0 and 5, enter new veiled number: ");
            numberOfStars = input.nextInt();
        }
    }

    // take the values from the terminal as input.
    public void addRestaurantFromT(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the restaurant: ");
        setName(input.next());

        System.out.println("Enter the price category of the restaurant: ");
        this.priceCategory = input.nextDouble();

        while (numberOfStars  > 5 || numberOfStars < 0 ){
            System.out.println("Number of stars should be between 0 and 5, enter new veiled number: ");
            numberOfStars = input.nextInt();
        }
    }

    // all getters.
    public Double getPriceCategory() {
        return priceCategory;
    }

    // all setters.
    public void setPriceCategory(Double priceCategory) {
        this.priceCategory = priceCategory;
    }

    // Override toString Method
    @Override
    public String toString() {
        return "Restaurant{" +
                "Name='" + super.getName() +
                ", Number Of Stars=" + numberOfStars +
                ", Price Category=" + priceCategory +
                ", All Reviews= "  + this.reviews +
                '}';
    }
}
