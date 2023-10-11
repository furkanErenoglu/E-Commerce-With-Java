import java.util.List;

public class CategoryService {


    public void choiceCategory(Category category, Product product){
        product.setCategory(category);
        category.getProductList().add(product);
        System.out.println("Product added succsesfully ");
    }



    public List<Product> getCategoryProducts(Category category){
        return category.getProductList();
    }



}
