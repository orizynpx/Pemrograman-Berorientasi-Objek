package cli;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private List<FoodItem> items;

    public Fridge() {
        this.items = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        this.items.add(item);
    }

    public void removeItem(FoodItem item) {
        this.items.remove(item);
    }

    public List<FoodItem> getItems() {
        return this.items;
    }
}