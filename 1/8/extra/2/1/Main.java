import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), a = scanner.nextInt() - 1, b = scanner.nextInt() - 1, c = scanner.nextInt() - 1,
                d = scanner.nextInt() - 1;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = i + 1;

        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
        while (c < d) {
            int temp = arr[c];
            arr[c] = arr[d];
            arr[d] = temp;
            c++;
            d--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1)
                System.out.print(" ");
        }
    }
}