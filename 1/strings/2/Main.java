import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(toggle(scanner.next().charAt(0)));
    }

    static char toggle(char c) {
        if (c >= 'a' && c <= 'z')
            return (char) (c - 32);
        if (c >= 'A' && c <= 'Z')
            return (char) (c + 32);
        return c;
    }
}