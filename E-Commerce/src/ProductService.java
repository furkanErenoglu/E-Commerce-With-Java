import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class ProductService {
    private final ShopService shopService;
    ProductService(ShopService shopService){
        this.shopService = shopService;
    }

    private List<Product> products = new ArrayList<>();


    public void addProduct(Shop shop ,Product product ){
        products.add(product);
        shopService.addProduct(shop.getShopId(), product);

    }

    public Product getProductById(String productId){
        for (Product product: products){
            if (product.getProductId().equals(productId)){
                return product;
            }
        }
        return null;
    }

    public void addProductReview(String productId,  Review review, String userId){
        getProductById(productId).getReviews().put(userId, review);
    }

    public List<Product> getAllProducts(){
        return products;
    }


}
