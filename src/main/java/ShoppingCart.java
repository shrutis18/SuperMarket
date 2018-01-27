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
        int totalCartPrice = productItems.stream().mapToInt(productItem -> productItem.getQuantity() * productItem.getProduct().getPrice()).sum();
        int discount = calculateDiscount();
        return totalCartPrice - discount;
    }

    public int calculateDiscount() {
      return   productItems.stream().filter(productItem ->(productItem.getProduct().hasOffer == true))
                .mapToInt(productItem -> productItem.getQuantity()/(productItem.getProduct().getBoughtX()+productItem.getProduct().getGetY())*productItem.getProduct().getGetY() * productItem.getProduct().getPrice())
                .sum();
    }
}
