import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (a < b && a < c)
            System.out.print(a + " " + (b < c ? b + " " + c : c + " " + b));
        else if (b < a && b < c)
            System.out.print(b + " " + (a < c ? a + " " + c : c + " " + a));
        else if (c < a && c < b)
            System.out.print(c + " " + (a < b ? a + " " + b : b + " " + a));
    }
}