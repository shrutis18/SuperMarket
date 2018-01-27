public class User {

    private ShoppingCart cart;

    public User() {
        this.cart = new ShoppingCart();
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void addProductItemToCart(ProductItem productItem) {
        cart.addProductItem(productItem);
    }
}
