import java.util.Scanner;
public class GroceryStore {
    public static void main(String[] args) {

        GroceryProductFactory bananaFactory = new BananaFactory();
        GroceryProductFactory appleFactory = new AppleFactory();

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nHow many Bananas do you want: ");
        int numOfBananas = scanner.nextInt();
        System.out.print("How many Apples do you want: ");
        int numOfApples = scanner.nextInt();

        scanner.close();

        Banana bananaProduct = bananaFactory.getBanana(numOfBananas);
        Apple appleProduct = appleFactory.getApple(numOfApples);

        System.out.println("\nProduce: " + bananaProduct.getName());
        System.out.println("Quantity: " + numOfBananas);
        System.out.println("Price per Banana: $" + bananaProduct.getPrice());
        System.out.println("Total: $" + bananaProduct.TotalPrice());
        
        System.out.println("\nProduce: " + appleProduct.getName());
        System.out.println("Quantity: " + numOfApples);
        System.out.println("Price per Apple: $" + appleProduct.getPrice());
        System.out.println("Total: $" + appleProduct.TotalPrice());
        System.out.println("\n");
    }
}
