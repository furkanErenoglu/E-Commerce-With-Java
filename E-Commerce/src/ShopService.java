import java.util.ArrayList;
import java.util.List;

public class ShopService {
    List<Shop> shops = new ArrayList<>();

    public void addShop(Shop shop){
        shops.add(shop);
    }

    public Shop getShopById(String shopId){
        for (Shop shop : shops){
            if (shop.getShopId().equals(shopId)){
                return shop;
            }
        }
        return null;
    }


    public List<Product> getShops(String shopId) {
        return getShopById(shopId).getProductList();
    }




    public void addProduct(String shopId, Product product){
        getShopById(shopId).getProductList().add(product);
        getShopById(shopId).getCategoryList().add(product.getCategory());
        System.out.println("product added");
    }


}
