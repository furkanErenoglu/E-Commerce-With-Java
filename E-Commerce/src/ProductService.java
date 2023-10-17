import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class ProductService {
    private ShopService shopService;
    ProductService(ShopService shopService){
        this.shopService = shopService;
    }

    List<Product> products = new ArrayList<>();


    public void addProduct(Shop shop ,Product product ){
        products.add(product);
        shopService.addProduct(shop, product);

    }

    public Product getProductById(String productId){
        for (Product product: products){
            if (product.getProductId().equals(productId)){
                return product;
            }
        }
        return null;
    }

    public void addProductReview(String productId, String review){
        getProductById(productId).getReviews().put(productId, review);
    }
}
