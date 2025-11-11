package cli;

public class MainMenuPage extends Page {
    public MainMenuPage(Fridge fridge) {
        super("=== Fridge ===", fridge);
    }

    @Override
    protected void displayContent() {
        System.out.println("What would you like to do?");
        System.out.println("1. Look inside");
        System.out.println("2. Put in a food item");
        System.out.println("3. Quit");
        System.out.print("Your choice: ");
    }

    @Override
    public Displayable handleInput(String input) {
        switch (input.trim()) {
            case "1":
                return new ViewContentPage(this.fridge);
            case "2":
                return new AddItemPage(this.fridge);
            case "3":
                return null;
            default:
                System.out.println("Invalid input. Please try again.");
                return this;
        }
    }
}
