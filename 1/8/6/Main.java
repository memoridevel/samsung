import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        int maxFreq = 0, mostFreq = arr[0];

        for (int i = 0; i < n; i++) {
            if (n - i <= maxFreq)
                break;

            int currFreq = 0;
            for (int j = 0; j < n; j++)
                if (arr[j] == arr[i])
                    currFreq++;

            if (currFreq > maxFreq) {
                maxFreq = currFreq;
                mostFreq = arr[i];
            }
        }

        System.out.println(mostFreq);
    }
}