import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    List<Category> categories = new ArrayList<>();

    public void addCategory(Category category){
        categories.add(category);
        System.out.println("Category added successfully");
    }

    public List<Category> getCategories(){
        return categories;
    }


    public List<Product> getCategoryBasedProducts(Category category){
        return category.getProductList();
    }



}
