import java.util.Scanner;

class GanjilGenap {
    public void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int N = sc.nextInt();

        isEven(N);
    }

    boolean isEven(int N) {
        return N % 2 == 0;
    }
}