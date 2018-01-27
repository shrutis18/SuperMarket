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
    public void itShouldReturnTotalPriceOfCartWhenNoOffer(){
        Product product = new Product("Dove Soap",30);
        ProductItem aProductItem = new ProductItem(product,5);
        User aUser = new User();
        aUser.addProductItemToCart(aProductItem);
        Assert.assertEquals(150,aUser.getCart().getCartPrice());
    }

    @Test
    public void itShouldBeAbleToCalculateDiscountBasedOnOffer(){
        Product product = new Product("Dove Soap",30);
        product.setOffer(2,1);
        ProductItem aProductItem = new ProductItem(product,3);
        User aUser = new User();
        aUser.addProductItemToCart(aProductItem);
        Assert.assertEquals(30,aUser.getCart().calculateDiscount());
    }

    @Test
    public void itShouldBeAbleToCalculateTotalPriceWithAnOffer() {
        Product product1 = new Product("Dove Soap",30);
        product1.setOffer(2,1);
        ProductItem aProductItem1 = new ProductItem(product1,3);
        Product product2 = new Product("Axe",100);
        ProductItem aProductItem2 = new ProductItem(product2,2);
        User aUser = new User();
        aUser.addProductItemToCart(aProductItem1);
        aUser.addProductItemToCart(aProductItem2);
        Assert.assertEquals(260,aUser.getCart().getCartPrice());
    }

}
