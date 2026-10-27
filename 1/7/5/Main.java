import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), i = 0;
        while (n > 0) {
            n /= 2;
            i++;
        }
        System.out.println(i);
    }
}