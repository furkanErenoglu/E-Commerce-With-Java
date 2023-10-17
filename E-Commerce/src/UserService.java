import java.util.*;

public class UserService {

    List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

    public void addFavorite(User user, Product product){
        user.getFavorite().add(product);
    }

    public void buyProduct(User user, Product product){
        user.getProducts().add(product);
    }

    public List<Product> getFavoriteList(String userID){
        return (List<Product>) getUserById(userID);
    }

    public List<Product> getPastOrders(User user){
        return user.getProducts();
    }

    public User getUserById(String userId){
       for (User user : users ){
           if (user.getId().equals(userId)){
               return user;
           }
       }
       return null;
    }


}