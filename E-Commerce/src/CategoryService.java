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

    public Category getCategoryById(String categoryId){
        for (Category category: categories){
            if (category.getCategoryId().equals(categoryId)){
                return category;
            }
        }
        return null;
    }

    public List<Product> getCategoryBasedProducts(String categoryId){
        return getCategoryById(categoryId).getProductList();
    }



}
