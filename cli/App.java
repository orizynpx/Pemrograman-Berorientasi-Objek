package cli;

import java.util.Scanner;

public class App {
    private Fridge fridge;
    private Displayable currentPage;

    public App() {
        this.fridge = new Fridge();
        this.currentPage = new MainMenuPage(this.fridge);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (this.currentPage != null) {
            this.currentPage.display();
            this.currentPage = this.currentPage.handleInput(sc.nextLine());
            System.out.println();
        }

        System.out.println("Turning off fridge...");
    }
}
