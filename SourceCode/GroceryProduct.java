abstract class GroceryProduct {
    private String name;
    protected double price;

    public GroceryProduct(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
