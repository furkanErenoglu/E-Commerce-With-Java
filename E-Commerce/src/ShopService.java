import java.util.ArrayList;
import java.util.List;

public class ShopService {
    List<Shop> shops = new ArrayList<>();

    public void addShop(Shop shop){
        shops.add(shop);
    }

    public List<Product> getShops(Shop shop){
        return shop.getProductList();
    }

    public void addProduct(Shop shop, Product product){
        shop.getProductList().add(product);
        System.out.println("product added");
    }


}
