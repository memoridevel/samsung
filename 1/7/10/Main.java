import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() + 1, i = 2;
        while (i < n) {
            if (n % i == 0) {
                n++;
                i = 2;
                continue;
            }
            i++;
        }
        System.out.println(n);
    }
}