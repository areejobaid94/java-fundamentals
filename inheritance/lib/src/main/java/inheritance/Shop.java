package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop extends Place  {
    // The properties
    private String description;
    private int numberOfDollar;

    // The default constructor =>  if there is no arg => take the values from the terminal as input.
    public Shop(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name : ");
        super.setName(input.next());
        System.out.println("Enter the description : ");
        this.description = input.next();
        System.out.println("Enter the Number Of Dollar : ");
        numberOfDollar = input.nextInt();
    }

    public Shop(String name,String description,int numberOfDollar){
        super.setName(name);
        this.description = description;
        this.numberOfDollar = numberOfDollar;
    }

    // Override toString Method
    @Override
    public String toString() {
        return "Shop{" +
                "name='" + super.getName() + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollar=" + numberOfDollar +
                '}';
    }
}
