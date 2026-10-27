import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if (a > b)
            if (a > c)
                System.out.println(a);
            else
                System.out.println(c);
        else if (b > c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}