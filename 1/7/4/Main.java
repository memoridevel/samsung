import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), i = 0;
        while (a >= b) {
            a -= b;
            i++;
        }
        System.out.println(i + " " + a);
    }
}