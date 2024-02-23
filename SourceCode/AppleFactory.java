class AppleFactory implements GroceryProductFactory {
    @Override
    public Banana getBanana(int Num) {
        return null;
    }
    @Override
    public Apple getApple(int Num) {
        return new Apple("Apple", Num);
    }
}
