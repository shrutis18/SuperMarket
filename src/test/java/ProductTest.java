import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductTest {

@Test
    public void itShouldHaveANameAndPrice() {
    Product doveSoap = new Product("Dove Soap",30);
    Assert.assertEquals("Dove Soap",doveSoap.getName());
    Assert.assertEquals(30,doveSoap.getPrice());
}

}