public class Product {
    private final String name;
    private final int price;
    private int boughtX;
    private int getY;
    public boolean hasOffer;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        this.hasOffer = false;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setOffer(int boughtX, int getY) {
        this.hasOffer = true;
        this.boughtX = boughtX;
        this.getY = getY;
    }

    public int getBoughtX() {
        return boughtX;
    }

    public int getGetY() {
        return getY;
    }
}
