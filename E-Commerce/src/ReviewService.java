public class ReviewService {

    public void createReview(User user, Product product, Review review){
        for (Product p : user.getProducts()){
            if (p.equals(product)){
                review.setProduct(product);
                review.setUser(user);
                review.getComment().put(user.getFullName(), review.getMassege());
            }else {
                System.out.println("You already have review");
            }
        }

    }
}


