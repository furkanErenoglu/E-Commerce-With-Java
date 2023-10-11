import java.util.List;

public class UserService {


    public void addFavorite(User user, Product product){
        user.getFavorite().add(product);
    }

    public void buyProduct(User user, Product product){
        user.getProducts().add(product);
    }

    public List<Product> getFavoriteList(User user){
        return user.getFavorite();
    }

    public List<Product> getPastOrders(User user){
        return user.getProducts();
    }


}