package Ex22;

import java.util.Locale;
import java.util.Scanner;

public class ProductData {
    public static void main(String[] args) {

        Product produto = new Product();

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String productName = scan.nextLine();
        produto.setName(productName);
        System.out.print("Price: ");
        double productPrice = scan.nextDouble();
        produto.setPrice(productPrice);
        System.out.print("Quantity in stock: ");
        int productQuantity = scan.nextInt();
        produto.setQuantity(productQuantity);

        System.out.printf("Product data: %s, $%.2f, %d units, Total: $%.2f%n", produto.getName(), produto.getPrice(), produto.getQuantity(), produto.TotalValueInStock());

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = scan.nextInt();
        produto.AddProducts(quantity);

        System.out.printf("Updated data: %s, $%.2f, %d units, Total: $%.2f%n", produto.getName(), produto.getPrice(), produto.getQuantity(), produto.TotalValueInStock());

        System.out.print("Enter the number of products to be removed from stock: ");
        int removeQuantity = scan.nextInt();
        produto.RemoveProducts(removeQuantity);

        System.out.printf("Product data: %s, $%.2f, %d units, Total: $%.2f%n", produto.getName(), produto.getPrice(), produto.getQuantity(), produto.TotalValueInStock());




        scan.close();
    }
}
