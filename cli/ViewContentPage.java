package cli;

import java.util.List;

public class ViewContentPage extends Page {
    public ViewContentPage(Fridge fridge) {
        super("=== Fridge Contents ===", fridge);
    }

    @Override
    public void displayContent() {
        List<FoodItem> items = this.fridge.getItems();

        if (items.isEmpty()) {
            System.out.println("Fridge is empty.");
        } else {
            for (FoodItem item : items) {
                System.out.println("- " + item);
            }
        }

        System.out.println("\nPress Enter to continue...");
    }

    @Override
    public Displayable handleInput(String input) {
        return new MainMenuPage(this.fridge);
    }
}
