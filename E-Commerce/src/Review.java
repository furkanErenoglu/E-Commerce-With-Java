import java.util.HashMap;
import java.util.Map;

public class Review {
    private String reviewId;
    private User user;
    private Product product;
    private Map<String , String> reviews;
    private int rating;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Map<String , String> getReviews() {
        return reviews;
    }

    public void setReviews(Map<String , String> reviews) {
        this.reviews = reviews;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMassege() {
        return massege;
    }

    public void setMassege(String massege) {
        this.massege = massege;
    }
}
