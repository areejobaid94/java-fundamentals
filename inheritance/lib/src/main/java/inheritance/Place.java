package inheritance;

import java.util.ArrayList;

public abstract class Place {
    ArrayList<Review> reviews = new ArrayList<Review>();
    public String  name;
    int numberOfStars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Place(){

    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }
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
}
