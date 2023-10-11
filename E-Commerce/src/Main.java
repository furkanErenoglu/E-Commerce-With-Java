public class Main {
    public static void main(String[] args) {
        CategoryService categoryService= new CategoryService();
        ReviewService reviewService = new ReviewService();
        UserService userService = new UserService();
        ShopService shopService = new ShopService(categoryService);


        User user =new User();
        user.setId("123456789");
        user.setEmail("example@gmail.com");
        user.setBirthdate(1999,1,29);
        user.setFullName("Furkan Erenoglu");
        user.setPassword("123456789");


        User newUser =new User();
        newUser.setId("3215648978");
        newUser.setEmail("example2@gmail.com");
        newUser.setBirthdate(2007,12,29);
        newUser.setFullName("Begum Erogenous");
        newUser.setPassword("123456789");



        Shop shop = new Shop();
        shop.setShopId("123456789");
        shop.setFullName("Adidas");

        Shop newShop = new Shop();
        newShop.setShopId("321456789");
        newShop.setFullName("Nike");


        Product product = new Product();
        product.setProductId("45678913");
        product.setName("Adidas Superstar");
        product.setPrice(59.99);
        product.setDescription("jksdfjklaj asjkldasjd sfjklasjfla asfkljasfsaasdk skdaldsa");
        product.setStockAmount(100);

        Product newProduct = new Product();
        newProduct.setProductId("45678913");
        newProduct.setName("Nike Airforce");
        newProduct.setPrice(49.99);
        newProduct.setDescription("jksdfjklaj asjkldasjd sfjklasjfla asfkljasfsaasdk skdaldsa");
        newProduct.setStockAmount(100);

        Category category = new Category();
        category.setName("Shoes");
        category.setCategoryId("789456123");




        shopService.addProduct(shop,product,category);
        shopService.addProduct(newShop, newProduct, category);

        userService.buyProduct(user, product);
        userService.buyProduct(user, newProduct);
        userService.buyProduct(newUser, newProduct);
        userService.buyProduct(newUser, product);

        Review review = new Review();
        review.setReviewId("147258369");
        review.setRating(4);
        review.setMassege("dsjfklsdjaklsdj skajfaskjfl saklfjasfja kasjflaj ");


        reviewService.createReview(user, product, review);




    }

}