import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, N = sc.nextInt(), t = 0;
        while (i <= N) {
            t = sc.nextInt();
            if (t <= 437) {
                System.out.println("Crash " + i);
                break;
            }
            i++;
        }
        if (t > 437)
            System.out.println("No crash");
    }
}