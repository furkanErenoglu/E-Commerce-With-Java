import java.util.Map;

public class ReviewService {

    public void createReview(User user, Product product, Review review){
        if (!review.getReviews().containsKey(product.getName())){
            review.setProduct(product);
            review.setUser(user);
            review.getReviews().put(user.getFullName(), review.getMassege());
            System.out.println("added review");
        }else {
            System.out.println("You already have review for this product");
        }
    }

    public Map<String , String> getReviews(Review review){
        return review.getReviews();
    }
}


