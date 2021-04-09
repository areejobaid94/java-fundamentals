package inheritance;


import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {
    @Test public void ReviewTestToString () {
        Review review = new Review("anything","anything",3);
        assertEquals("Review{body='anything', numberOfStars=3, author='anything'}",review.toString());
    }
}
