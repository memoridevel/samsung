import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(x / 100 > 0 && x / 1000 == 0 && x > 0 && x % 5 == 0);
    }
}