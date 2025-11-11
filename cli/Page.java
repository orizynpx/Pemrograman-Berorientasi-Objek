package cli;

public abstract class Page implements Displayable {
    protected String title;
    protected Fridge fridge;

    public Page(String title, Fridge fridge) {
        this.title = title;
        this.fridge = fridge;
    }

    @Override
    public void display() {
        System.out.println(title);
        displayContent();
    }

    protected abstract void displayContent();
}
