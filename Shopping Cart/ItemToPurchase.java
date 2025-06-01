public class ItemToPurchase {
    private String itemName;
    private String itemDescription;
    private int itemPrice;
    private int itemQuantity;

    public ItemToPurchase() {
        this.itemName = "none";
        this.itemDescription = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }

    public ItemToPurchase(String name, String desc, int price, int quantity) {
        this.itemName = name;
        this.itemDescription = desc;
        this.itemPrice = price;
        this.itemQuantity = quantity;
    }

    public void setName(String name) {
        itemName = name;
    }

    public String getName() {
        return itemName;
    }

    public void setPrice(int price) {
        itemPrice = price;
    }

    public int getPrice() {
        return itemPrice;
    }

    public void setQuantity(int quantity) {
        itemQuantity = quantity;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public void setDescription(String desc) {
        itemDescription = desc;
    }

    public String getDescription() {
        return itemDescription;
    }

    public void printItemCost() {
        System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + itemPrice*itemQuantity);
    }

    public void printItemDescription() {
        System.out.println(itemName + ": " + itemDescription);
    }
}