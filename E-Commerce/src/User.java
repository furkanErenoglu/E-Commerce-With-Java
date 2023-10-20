import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String fullName;
    private String email;
    private String password;
    private LocalDate birthdate;
    private List<Product> products;
    private List<Product> favorite;

    public User(){
        this.products = new ArrayList<>();
        this.favorite = new ArrayList<>();
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int year, int mounth, int day) {
        this.birthdate = LocalDate.of(year, mounth,day);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getFavorite() {
        return favorite;
    }

    public void setFavorite(List<Product> favorite) {
        this.favorite = favorite;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
