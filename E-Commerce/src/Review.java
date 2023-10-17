import java.util.HashMap;
import java.util.Map;

public class Review {
    private String reviewId;
    private User user;
    private Map<String , String> reviews;
    private short rating;
    private String productId;
    private String massege;


    public Review(){
        this.reviews = new HashMap<>();
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<String , String> getReviews() {
        return reviews;
    }

    public void setReviews(Map<String , String> reviews) {
        this.reviews = reviews;
    }

    public short getRating() {
        return rating;
    }

    public void setRating(short rating) {
        this.rating = rating;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }


    public String getMassege() {
        return massege;
    }

    public void setMassege(String massege) {
        this.massege = massege;
    }
}
