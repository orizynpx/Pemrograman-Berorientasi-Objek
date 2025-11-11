package cli;

public interface Displayable {
    void display();
    Displayable handleInput(String input);
}
