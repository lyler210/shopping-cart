import java.util.ArrayList;

public class ShoppingCart {
    private String customerName;
    private String currentDate;
    private ArrayList<ItemToPurchase> cartItems;

    public ShoppingCart() {
        customerName = "none";
        currentDate = "January 1, 2016";
        cartItems = new ArrayList<>();
    }

    public ShoppingCart(String name, String date) {
        customerName = name;
        currentDate = date;
        cartItems = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getDate() {
        return currentDate;
    }

    public void addItem(ItemToPurchase item) {
        cartItems.add(item);
    }

    public void removeItem(String itemName) {
        for(int i = 0; i < cartItems.size(); i++) {
            if(cartItems.get(i).getName().equals(itemName)) {
                cartItems.remove(i);
                return;
            }
        }
        System.out.println("Item not found in cart. Nothing removed.");
    }

    public void modifyItem(ItemToPurchase item) {
        for(int i = 0; i < cartItems.size(); i++) {
            if(cartItems.get(i).getName().equals(item.getName())) {
                if(!item.getName().equals("none")) {
                    cartItems.get(i).setName(item.getName());
                }
                if(!item.getDescription().equals("none")) {
                    cartItems.get(i).setDescription(item.getDescription());
                }
                if(item.getPrice() != 0) {
                    cartItems.get(i).setPrice(item.getPrice());
                }
                if(item.getQuantity() != 0) {
                    cartItems.get(i).setQuantity(item.getQuantity());   
                }
                return;
            }
        }
        System.out.println("Item not found in cart. Nothing modified.");
    }

    public int getNumItemsInCart() {
        int numItems = 0;
        for(int i = 0; i < cartItems.size(); i++) {
            numItems += cartItems.get(i).getQuantity();
        }
        
        return numItems;
    }

    public int getCostOfCart() {
        int totalCost = 0;
        for (int i = 0; i < cartItems.size(); i++) {
            int itemCost = cartItems.get(i).getPrice() * cartItems.get(i).getQuantity();
            totalCost += itemCost;
        }
         return totalCost;
    }

    public void printTotal() {
        if(cartItems.size() != 0) {
            System.out.println(customerName+"'s Shopping Cart - " + currentDate);
            System.out.println("Number of Items: " + getNumItemsInCart());
            System.out.println();
            for(int i = 0; i < cartItems.size(); i++) {
                cartItems.get(i).printItemCost();
            }
            System.out.println();
            System.out.println("Total: $" + getCostOfCart());
        }
        else {
            System.out.println(customerName+"'s Shopping Cart - " + currentDate);
            System.out.println("Number of Items: 0");
            System.out.println();
            System.out.println("SHOPPING CART IS EMPTY");
            System.out.println();
            System.out.println("Total: $0");
        }
    }

    public void printItemDescriptions() {
        if(cartItems.size() != 0) {
            System.out.println(customerName+"'s Shopping Cart - " + currentDate);
            System.out.println();
            System.out.println("Item Descriptions");
            for(int i = 0; i < cartItems.size(); i++) {
                cartItems.get(i).printItemDescription();
            }
        }
        else {
            
            System.out.println("SHOPPING CART IS EMPTY");
        }
    }
}
