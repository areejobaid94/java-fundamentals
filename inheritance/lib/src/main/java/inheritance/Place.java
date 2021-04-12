package inheritance;

import java.util.ArrayList;

public abstract class Place {
    // The properties
    protected ArrayList<Review> reviews = new ArrayList<Review>();
    protected String  name;
    protected int numberOfStars;

    // The default constructor
    public void Place(){

    }

    // all getters.
    public String getName() {
        return name;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    // all setters.
    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    // add review method
    public void addReview(Review review){
        boolean notUpdateStarts = false;
        for (Review reviewInList : reviews){
            if(review == reviewInList){
                notUpdateStarts = true;
            }
        }
        reviews.add(review);
        if(notUpdateStarts == false)this.setNumberOfStars(review.getNumberOfStars());
        review.setPlace(this);
    }

    // Override toString Method
    @Override
    public abstract String toString();
}
