class BananaFactory implements GroceryProductFactory {
    @Override
    public Banana getBanana(int Num) {
        return new Banana("Banana", Num);
    }
    @Override
    public Apple getApple(int Num) {
        return null;
    }
}
