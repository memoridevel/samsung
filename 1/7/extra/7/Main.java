import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), i = 2;
        boolean f = false;
        while (i < n) {
            if (n % i == 0) {
                f = true;
                break;
            }
            i++;
        }
        System.out.println(f ? "composite" : "prime");
    }
}