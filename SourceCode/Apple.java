class Apple extends GroceryProduct {
    private int Num;
    public Apple(String produce, int Num) {
        super(produce);
        this.Num = Num;

        if (Num <= 5) {
            super.price = 1.25;
        } 
        else {
            super.price = 1.00;
        }
    }
    public double TotalPrice() {
        return Num * price;
    }
}
