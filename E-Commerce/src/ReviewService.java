import java.util.Map;

public class ReviewService {
    private ProductService productService;
    public ReviewService(ProductService productService){
        this.productService = productService;
    }


    public void createReview(String userId, String productId, Review review){
        if (!review.getReviews().containsKey(userId) && review.getProductId().equals(productId)){
            review.getReviews().put(userId, review.getMassege());
            productService.addProductReview(productId, review.getMassege());
        }
    }

    public Map<String , String> getReviews(Review review){
        return review.getReviews();
    }
}


