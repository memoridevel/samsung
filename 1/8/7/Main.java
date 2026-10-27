import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), negCount = 0, nonNegCount = 0;
        int[] arr = new int[n], neg = new int[n], nonNeg = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] < 0) {
                neg[negCount] = arr[i];
                negCount++;
            } else {
                nonNeg[nonNegCount] = arr[i];
                nonNegCount++;
            }
        }

        boolean f = true;

        for (int i = 0; i < negCount; i++) {
            if (!f)
                System.out.print(" ");
            System.out.print(neg[i]);
            f = false;
        }

        for (int i = 0; i < nonNegCount; i++) {
            if (!f)
                System.out.print(" ");
            System.out.print(nonNeg[i]);
            f = false;
        }

        System.out.println();
    }
}