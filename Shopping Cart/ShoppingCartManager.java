import java.util.Scanner;

public class ShoppingCartManager {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter customer's name:");
        String name = scnr.nextLine();
        System.out.println("Enter today's date:");
        String date = scnr.nextLine();
        ShoppingCart customer1 = new ShoppingCart(name, date);
        System.out.println();
        System.out.println("Customer name: " + customer1.getCustomerName());
        System.out.println("Today's date: " + customer1.getDate());
        System.out.println();

        char userChoice;
        boolean validChoice = false;
        do {
            printMenu();
            System.out.println();
            do {
                System.out.println("Choose an option:");
                userChoice = scnr.next().charAt(0);
                if(userChoice == 'a' || userChoice == 'd' || userChoice == 'c' || 
                userChoice == 'i' || userChoice == 'o' || userChoice == 'q') {
                    validChoice = true;
                }
            } while(!validChoice);
            executeMenu(userChoice, customer1, scnr);
        } while (userChoice != 'q');
        scnr.close();
    }

    public static void printMenu() {
        System.out.println("MENU");
        System.out.println("a - Add item to cart");
        System.out.println("d - Remove item from cart");
        System.out.println("c - Change item quantity");
        System.out.println("i - Output items' descriptions");
        System.out.println("o - Output shopping cart");
        System.out.println("q - Quit");
    }

    public static void executeMenu(char choice, ShoppingCart cart, Scanner scnr) {
        switch(choice) {
            case 'a':
                scnr.nextLine();
                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter the item name:");
                String itemName = scnr.nextLine();
                System.out.println("Enter the item description:");
                String itemDesc = scnr.nextLine();
                System.out.println("Enter the item price:");
                int itemPrice = scnr.nextInt();
                System.out.println("Enter the item quantity:");
                int itemQuant = scnr.nextInt();

                ItemToPurchase newItem = new ItemToPurchase(itemName, itemDesc, itemPrice, itemQuant);
                cart.addItem(newItem);
                System.out.println();
                break;
            case 'd':
                scnr.nextLine();
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter name of item to remove:");
                String itemRemoveName = scnr.nextLine();
                cart.removeItem(itemRemoveName);
                System.out.println();
                break;
            case 'c':
                scnr.nextLine();
                System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the item name:");
                String itemChangeName = scnr.nextLine();
                System.out.println("Enter the new quantity:");
                int itemChangeQuantity = scnr.nextInt();
                ItemToPurchase itemChange = new ItemToPurchase();
                itemChange.setQuantity(itemChangeQuantity);
                itemChange.setName(itemChangeName);
                cart.modifyItem(itemChange);
                System.out.println();
                break;
            case 'i':
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                cart.printItemDescriptions();
                System.out.println();
                break;
            case 'o':
                System.out.println("OUTPUT SHOPPING CART");
                cart.printTotal();
                System.out.println();
                break;
            case 'q':
                break;
            default:
                break;
        }
    }
}
