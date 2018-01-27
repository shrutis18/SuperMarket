import org.junit.Assert;
import org.junit.Test;

public class ProductItemTest {
    @Test

    public void itShouldHaveAProductAndItsQuantity() {
        Product doveSoap = new Product("Dove Soap",30);
        ProductItem productItem = new ProductItem(doveSoap,5);
        Assert.assertEquals(doveSoap,productItem.getProduct());
        Assert.assertEquals("Dove Soap",doveSoap.getName());
        Assert.assertEquals(30,doveSoap.getPrice());
        Assert.assertEquals(5,productItem.getQuantity());
    }
}
