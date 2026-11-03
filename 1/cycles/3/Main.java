import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), i;
        boolean f = false;
        for (; a <= b; a++) {
            i = 2;
            while (i < a && a <= b) {
                if (a % i == 0) {
                    a++;
                    i = 2;
                    continue;
                }
                i++;
            }
            if (a <= b) {
                System.out.print(a + " ");
                f = true;
            }
        }
        if (!f)
            System.out.print(0);
    }
}