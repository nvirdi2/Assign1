class Banana extends GroceryProduct {
    private int Num;
    public Banana(String produce, int Num) {
        super(produce);
        this.Num = Num;

        if (Num <= 5) {
            super.price = 2.10;
        } 
        else {
            super.price = 1.25;
        }
    }
      public double TotalPrice() {
        return Num * price;
    }
}
