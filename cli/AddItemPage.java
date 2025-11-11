package cli;

public class AddItemPage extends Page {
    protected int step = 0;
    protected String tempName;

    public AddItemPage(Fridge fridge) {
        super("=== Add Items ===", fridge);
    }

    private boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    @Override
    protected void displayContent() {
        if (step == 0) {
            System.out.print("Item name: ");
        } else if (step == 1) {
            System.out.print("Quantity (pcs): ");
        }
    }

    @Override
    public Displayable handleInput(String input) {
        if (step == 0) {
            if (input.isEmpty()) {
                System.out.println("Item name cannot be empty.");
                return this;
            }

            this.tempName = input;
            this.step = 1;
            return this;
        }

        if (!isInteger(input)) {
            System.out.println("Not a number.");
            return this;
        }

        int quantity = Integer.parseInt(input);

        if (quantity <= 0) {
            System.out.println("Quantity must be larger than 0.");
            return this;
        }

        FoodItem newItem = new FoodItem(tempName, quantity);
        this.fridge.addItem(newItem);
        System.out.println(newItem + " were put into the fridge.");

        return new MainMenuPage(this.fridge);
    }
}
