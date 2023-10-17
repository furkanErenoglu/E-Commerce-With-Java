public class Main {
    public static void main(String[] args) {
        ShopService shopService = new ShopService();
        ProductService productService = new ProductService(shopService);
        CategoryService categoryService= new CategoryService();
        ReviewService reviewService = new ReviewService(productService);
        UserService userService = new UserService();



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

        userService.addUser(user);
        userService.addUser(newUser);



        Category category = new Category();
        category.setName("Shoes");
        category.setCategoryId("789456123");

        categoryService.addCategory(category);





        Shop shop = new Shop();
        shop.setShopId("123456789");
        shop.setFullName("Adidas");

        Shop newShop = new Shop();
        newShop.setShopId("321456789");
        newShop.setFullName("Nike");


        shopService.addShop(shop);
        shopService.addShop(newShop);



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


        productService.addProduct(shop, product);
        productService.addProduct(newShop, newProduct);



        userService.buyProduct(user, product);
        userService.buyProduct(user, newProduct);
        userService.buyProduct(newUser, newProduct);
        userService.buyProduct(newUser, product);

        Review review = new Review();
        review.setReviewId("147258369");
        review.setRating((short) 4);
        review.setMassege("dsjfklsdjaklsdj skajfaskjfl saklfjasfja kasjflaj ");
        review.setProductId(product.getProductId());
        review.setUser(user);

        Review newReview = new Review();
        newReview.setReviewId("123456789");
        newReview.setRating((short) 5);
        newReview.setMassege("Mahmut tuncer show");
        newReview.setProductId(product.getProductId());
        newReview.setUser(newUser);

        reviewService.createReview(user.getId(), product.getProductId(), review );
        reviewService.createReview(newUser.getId(), product.getProductId(), newReview);


        System.out.println(product.getReviews());





    }

}