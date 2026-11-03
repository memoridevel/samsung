import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), N = in.nextInt();

        int count = 0;

        for (int ka = 0; ka * a <= N; ka++) {
            int rem1 = N - ka * a;
            for (int kb = 0; kb * b <= rem1; kb++)
                if ((rem1 - kb * b) % c == 0)
                    count++;
        }

        System.out.println(count);

        for (int ka = 0; ka * a <= N; ka++) {
            int rem1 = N - ka * a;
            for (int kb = 0; kb * b <= rem1; kb++)
                if ((rem1 - kb * b) % c == 0)
                    System.out.println(ka + " " + kb + " " + (rem1 - kb * b) / c);
        }
    }
}