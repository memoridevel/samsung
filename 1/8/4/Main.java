import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(), array[] = new int[n];

        for (int i = 0; i < n; i++)
            array[i] = 4 + i * 3;

        for (int i = 0; i < n; i++) {
            System.out.print(array[i]);
            if (i < n - 1)
                System.out.print(" ");
        }
    }
}