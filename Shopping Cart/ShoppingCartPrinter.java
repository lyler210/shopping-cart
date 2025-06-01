import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      System.out.println("Item 1");
      System.out.println("Enter the item name:");
      ItemToPurchase item1 = new ItemToPurchase();
      item1.setName(scnr.nextLine());
      System.out.println("Enter the item price:");
      item1.setPrice(scnr.nextInt());
      System.out.println("Enter the item quantity:");
      item1.setQuantity(scnr.nextInt());

      System.out.println();
      scnr.nextLine();

      System.out.println("Item 2");
      System.out.println("Enter the item name:");
      ItemToPurchase item2 = new ItemToPurchase();
      item2.setName(scnr.nextLine());
      System.out.println("Enter the item price:");
      item2.setPrice(scnr.nextInt());
      System.out.println("Enter the item quantity:");
      item2.setQuantity(scnr.nextInt());

      System.out.println();
      
      System.out.println("TOTAL COST");
      System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1.getQuantity()*item1.getPrice());
      System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2.getQuantity()*item2.getPrice());
      System.out.println();
      System.out.println("Total: $" + (item1.getQuantity()*item1.getPrice() + item2.getQuantity()*item2.getPrice()));
      scnr.close();
   }
}