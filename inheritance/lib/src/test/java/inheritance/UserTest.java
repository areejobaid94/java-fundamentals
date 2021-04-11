package inheritance;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    @Test public void UserTestToString () {
        User user = new User("anything",3.0);
        assertEquals("User{author='anything', authorAge=3.0, reviews=[]}",user.toString());
        Review review = new Review("anything","anything",3);
        Restaurant restaurant = new Restaurant("anything", 4,1.3);
        restaurant.addReview(review);
        assertEquals("The review has been added",user.addReview(review));
        assertEquals("you can't add new review for anything",user.addReview(review));
    }
}
