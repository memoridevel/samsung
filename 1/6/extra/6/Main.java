import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a)
            System.out.println("impossible");
        else {
            int temp;
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }
            if (b > c) {
                temp = b;
                b = c;
                c = temp;
            }
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }

            if (a * a + b * b == c * c)
                System.out.println("right");
            else if (a * a + b * b > c * c)
                System.out.println("acute");
            else
                System.out.println("obtuse");
        }
    }
}