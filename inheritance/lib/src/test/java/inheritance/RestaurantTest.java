package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test public void RestaurantTestToString () {
        Restaurant restaurant = new Restaurant("anything", 4,1.3);
        assertEquals("Test toString method","Restaurant{name='anything', numberOfStars=4, priceCategory=1.3, author=null, body=null}",restaurant.toString());
    }

    @Test public  void  RestaurantTestAddReview(){
        Review review = new Review("anything","anything",3);
        Restaurant restaurant = new Restaurant("anything", 4,1.3);
        restaurant.addReview(review);
        assertEquals("Test toString method","Restaurant{name='anything', numberOfStars=3, priceCategory=1.3, author=anything, body=anything}",restaurant.toString());
    }
}
