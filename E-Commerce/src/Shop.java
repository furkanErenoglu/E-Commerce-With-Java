import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String shopId;
    private String fullName;
    private List<Product> productList;

    public Shop(){
        this.productList = new ArrayList<>();
    }

    public String getShopId(){
        return shopId;
    }

    public void setShopId(String shopId){
        this.shopId = shopId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
