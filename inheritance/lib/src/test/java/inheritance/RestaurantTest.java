package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test public void RestaurantTestToString () {
        Restaurant restaurant = new Restaurant("anything", 4,1.3);
        System.out.println(restaurant.toString());
        assertEquals("Test toString method","Restaurant{name='anything, numberOfStars=4, priceCategory=1.3}",restaurant.toString());
    }

    @Test public  void  RestaurantTestAddReview(){
        Review review = new Review("anything","anything",3);
        Restaurant restaurant = new Restaurant("anything", 4,1.3);
        restaurant.addReview(review);
        System.out.println(review.toString());
        assertEquals("Test toString method for review after add the review to the restaurant","Review{body='anything', numberOfStars=3, author='anything, name='anything, priceCategory=1.3}",review.toString());
        assertEquals("Test the num of stars after adding the review",3,restaurant.getNumberOfStars());
    }
}
