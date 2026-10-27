import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, a = sc.nextInt(), b = sc.nextInt(), c = 0;
        boolean f = false;
        if (b < 0) {
            b = -b;
            f = true;
        }
        while (i < b) {
            c += a;
            i++;
        }
        System.out.println(f ? -c : c);
    }
}