package inheritance;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopTest {
    @Test public void ShopTestToString () {
        Shop shop = new Shop("anything","anything",4);
        assertEquals("Shop{name='anything', description='anything', numberOfDollar=4}",shop.toString());
    }

    @Test public void ShopAddReview () {
        Review review = new Review("anything","anything",3);
        Shop shop = new Shop("anything","anything",4);
        shop.addReview(review);
        assertEquals("Review{Body='anything', Number Of Stars=3, Author='anything, Place Name='anything}",review.toString());
    }
}
