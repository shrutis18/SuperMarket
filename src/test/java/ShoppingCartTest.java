import org.junit.Assert;
import org.junit.Test;

public class ShoppingCartTest {
    @Test
    public void itShouldHaveAnEmptyCart() {
        ShoppingCart shoppingCart = new ShoppingCart();
        Assert.assertEquals(0,shoppingCart.getProductItems().size());
        Assert.assertEquals(0,shoppingCart.getCartPrice());
    }

    @Test
    public void itShouldHaveListOfProductItems(){
        Product product = new Product("Dove Soap",30);
        ProductItem aProductItem = new ProductItem(product,5);
        User aUser = new User();
        aUser.addProductItemToCart(aProductItem);
        Assert.assertEquals(1, aUser.getCart().getProductItems().size());
    }

    @Test
    public void itShouldReturnTotalPriceOfCart(){
        Product product = new Product("Dove Soap",30);
        ProductItem aProductItem = new ProductItem(product,5);
        User aUser = new User();
        aUser.addProductItemToCart(aProductItem);
        Assert.assertEquals(150,aUser.getCart().getCartPrice());
    }
}
