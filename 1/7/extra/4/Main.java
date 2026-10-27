import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 10000, a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        boolean f = true;
        while (i < 100000) {
            if (i % a == b && i % c == d) {
                f = false;
                System.out.print(i + " ");
            }
            i++;
        }
        if (f)
            System.out.print(-1);
    }
}