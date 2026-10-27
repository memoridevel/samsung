import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        System.out
                .println((a & 1) == 0 && (b & 1) == 0 || (b & 1) == 0 && (c & 1) == 0 || (a & 1) == 0 && (c & 1) == 0);
    }
}