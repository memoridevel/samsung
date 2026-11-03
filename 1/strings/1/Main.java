import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(IsDigit(scanner.next().charAt(0)) ? "yes" : "no");
    }

    static boolean IsDigit(char c) {
        return c >= '0' && c <= '9';
    }
}