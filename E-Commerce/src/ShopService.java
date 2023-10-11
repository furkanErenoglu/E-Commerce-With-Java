import java.util.List;

public class ShopService {
    private CategoryService categoryService;
    public ShopService(CategoryService categoryService){
        this.categoryService = categoryService;
    }

    public void addProduct(Shop shop, Product product, Category category){
        product.setShop(shop);
        shop.getProductList().add(product);
        categoryService.choiceCategory(category,product);
    }

    public List<Product> getProducts(Shop shop){
        return shop.getProductList();
    }



}
