import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n %= 86400;
        int h = n / 3600;
        int m = (n % 3600) / 60;
        int s = n % 60;
        System.out.println(h + ":" + m / 10 + m % 10 + ":" + s / 10 + s % 10);
    }
}