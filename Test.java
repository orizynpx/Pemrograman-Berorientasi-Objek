import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int T = userInput.nextInt();
        String[] outputValue = new String[T];
        int sumOfCandies = 0;

        for (int i = 0; i < T; i++) {
            int N = userInput.nextInt();

            for (int j = 0; j < N; j++) {
                int numOfCandyFromEachKid = userInput.nextInt();
                sumOfCandies = (sumOfCandies + (numOfCandyFromEachKid % N) % N);
            }

            outputValue[i] = (sumOfCandies % N == 0) ? "YES" : "NO";
        }

        for (String each : outputValue) {
            System.out.println(each);
        }

        userInput.close();
    }
}