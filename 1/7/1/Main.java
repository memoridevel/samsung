import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        do {
            i++;
        } while (scanner.nextInt() >= 0);
        System.out.println(i);
    }
}