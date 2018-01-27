import org.junit.Assert;
import org.junit.Test;

public class ProductTest {

@Test
    public void itShouldHaveANameAndPrice() {
    Product doveSoap = new Product("Dove Soap",30);
    Assert.assertEquals("Dove Soap",doveSoap.getName());
    Assert.assertEquals(30,doveSoap.getPrice());
}

@Test
    public void itMayOrMayNotHaveAnOffer(){
    Product doveSoap = new Product("Dove Soap", 30);
    doveSoap.setOffer(2, 1);
    Assert.assertEquals(2,doveSoap.getBoughtX());
    Assert.assertEquals(1,doveSoap.getGetY());
}

}