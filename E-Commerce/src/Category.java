import java.util.ArrayList;
import java.util.List;

public class Category {
    private String categoryId;
    private String name;
    private List<Product> productList;

    public Category(){
        this.productList = new ArrayList<>();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList(){
        return productList;
    }

    public void setProductList(List<Product> productList){
        this.productList = productList;
    }
}
