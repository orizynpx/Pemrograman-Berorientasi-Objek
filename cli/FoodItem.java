package cli;

public class FoodItem {
    private String itemName;
    private int quantity;

    public FoodItem(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return this.itemName + " (" + this.quantity + " pcs)";
    }
}
