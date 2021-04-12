package inheritance;


import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test public void ReviewTestToString () {
        Review review = new Review("anything","anything",3);
        assertEquals("Review{Body='anything', Number Of Stars=3, Author='anything}",review.toString());
    }

    @Test public void ReviewTestUpdateReview () {
        Review review = new Review("anything","anything",3);
        Shop shop = new Shop("anything","anything",4);
        shop.addReview(review);
        review.updateStars(5);
        assertEquals("Review{Body='anything', Number Of Stars=5, Author='anything, Place Name='anything}",review.toString());
        assertEquals(5,review.place.getNumberOfStars());
    }
}
