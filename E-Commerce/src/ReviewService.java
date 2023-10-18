import java.util.HashMap;
import java.util.Map;

public class ReviewService {
    private ProductService productService;
    public ReviewService(ProductService productService){
        this.productService = productService;
    }

    private Map<String , Review> reviews = new HashMap<>();


    public void createReview(String userId, String productId, Review review){
        if (!reviews.containsKey(userId) && review.getProductId().equals(productId)){
            reviews.put(userId, review);
            productService.addProductReview(productId, review, userId);
        }
    }

    public Map<String, Review> getReviews(){
        return reviews;
    }

    public String getReviewMessage(Review review){
        return review.getMassege();
    }
}


