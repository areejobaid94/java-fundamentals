package inheritance;
import org.junit.Test;
import static org.junit.Assert.*;

public class TheaterTest {
    @Test public void TheaterTestToString () {
        Theater theater = new Theater();
        assertEquals("Theater{movies names=[]}",theater.toString());
        Movie movie = new Movie("Anything","AnyThing");
        theater.addMovie(movie);
        assertEquals("Theater{movies names=[Anything]}",theater.toString());
    }

    @Test public void TheaterTestAddRemoveAndUpdate () {
        Theater theater = new Theater();
        assertEquals("test before adding movie","Theater{movies names=[]}",theater.toString());
        Movie movie = new Movie("Anything","AnyThing");
        theater.addMovie(movie);
        assertEquals("test after adding the first move","Theater{movies names=[Anything]}",theater.toString());
        movie.setName("any");
        theater.updateMovie(movie);
        assertEquals("test after updating the movie value","Theater{movies names=[any]}",theater.toString());
        theater.removeMovie(movie);
        assertEquals("test after remove the movie","Theater{movies names=[]}",theater.toString());
    }

    @Test public void TheaterTestAddReview () {
        Theater theater = new Theater("anything");
        MovieReview reviewForMovie = new MovieReview("anything","anything",3,"anything");
        theater.addReview(reviewForMovie);
        assertEquals("add review for movie","MovieReview{movie='anything', Body='anything, Number Of Stars=3, Author='anything, Place Name='anything}",reviewForMovie.toString());
        Review review = new Review("anything","anything",3);
        theater.addReview(review);
        assertEquals("add review for Theater","Review{Body='anything', Number Of Stars=3, Author='anything, Place Name='anything}",review.toString());
    }
}
