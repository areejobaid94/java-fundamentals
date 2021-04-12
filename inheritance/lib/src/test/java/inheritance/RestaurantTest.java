package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test public void RestaurantTestToString () {
        Restaurant restaurant = new Restaurant("anything", 4,1.3);
        System.out.println(restaurant.toString());
        assertEquals("Test toString method","Restaurant{Name='anything, Number Of Stars=4, Price Category=1.3, All Reviews= []}",restaurant.toString());
    }

    @Test public  void  RestaurantTestAddReview(){
        Review review = new Review("anything","anything",3);
        Restaurant restaurant = new Restaurant("anything", 4,1.3);
        restaurant.addReview(review);
        assertEquals("Review{Body='anything', Number Of Stars=3, Author='anything, Place Name='anything}",review.toString());
        assertEquals("Test the num of stars after adding the review",3,restaurant.getNumberOfStars());
        review.setNumberOfStars(2);
        restaurant.addReview(review);
        assertEquals("Test the num of stars after adding the review for the 2nd time",3,restaurant.getNumberOfStars());
    }
}
