import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void itShouldHaveAnEmptyCartInitially() {
        User aUser = new User();

        ShoppingCart userCart = aUser.getCart();

        Assert.assertEquals(0,userCart.getProductItems().size());
        Assert.assertEquals(0,userCart.getCartPrice());
    }
}
