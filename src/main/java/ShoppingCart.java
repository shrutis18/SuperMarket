import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<ProductItem> productItems;

    public ShoppingCart() {
        this.productItems = new ArrayList<>();
    }

    public List<ProductItem> getProductItems() {
        return productItems;

    }

    public void addProductItem(ProductItem productItem) {
       productItems.add(productItem);
    }

    public int getCartPrice() {
        return productItems.stream().mapToInt(productItem -> productItem.getQuantity() * productItem.getProduct().getPrice()).sum();
    }
}
