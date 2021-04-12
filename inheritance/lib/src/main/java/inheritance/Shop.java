package inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop extends Place  {
    String description;
    int numberOfDollar;

    public Shop(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name : ");
        this.name = input.next();
        System.out.println("Enter the description : ");
        this.description = input.next();
        System.out.println("Enter the Number Of Dollar : ");
        numberOfDollar = input.nextInt();
    }

    public Shop(String name,String description,int numberOfDollar){
        this.name = name;
        this.description = description;
        this.numberOfDollar = numberOfDollar;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollar=" + numberOfDollar +
                '}';
    }
}
