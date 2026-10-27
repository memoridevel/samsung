import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt())
            return;
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        int x = scanner.nextInt();
        boolean f = false;

        for (int i = 0; i < n; i++)
            if (arr[i] == x) {
                System.out.println(i + 1);
                f = true;
                break;
            }

        if (!f)
            System.out.println("NO");
    }
}